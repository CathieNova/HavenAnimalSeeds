package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.neoforged.neoforge.event.EventHooks;

public class MobSeedEntity extends BlockEntity
{
    public static final int GROWTH_CHECK_INTERVAL = 10;
    private static final int SAVE_INTERVAL = 20;
    private static final int CLIENT_SYNC_INTERVAL = 100;

    private int spawnTimer;
    private int maxGrowthTime;
    private int ticksSinceSave;
    private int ticksSinceClientSync;
    private long lastGrowthTick = -1;
    private boolean growthPaused;
    private long clientSyncGameTime = -1;
    private CompoundTag mobVariant = new CompoundTag();
    private String mobVariantKey = "";
    private boolean mobVariantReady;

    public MobSeedEntity(BlockPos pos, BlockState state)
    {
        super(ModBlockEntities.mob_seed.get(), pos, state);
        maxGrowthTime = Math.max(1, getSeedBlock().getGrowthTime());
        spawnTimer = maxGrowthTime;
    }

    public void grow(ServerLevel level, BlockPos pos, BlockState state)
    {
        if (!ensureMobVariant(level, pos))
        {
            return;
        }

        long currentTick = level.getGameTime();
        int elapsedTicks = getElapsedTicks(currentTick);
        boolean playerNearby = hasPlayerNearby(level, pos, HavenConfig.playerGrowthDistance);
        boolean pauseChanged = playerNearby != growthPaused;
        growthPaused = playerNearby;

        if (!growthPaused && elapsedTicks > 0 && spawnTimer > 0)
        {
            spawnTimer = Math.max(0, spawnTimer - elapsedTicks);
            ticksSinceSave += elapsedTicks;
            ticksSinceClientSync += elapsedTicks;
        }

        if (spawnTimer <= 0)
        {
            if (!spawnMob(level, pos, state))
            {
                spawnTimer = GROWTH_CHECK_INTERVAL;
                saveAndSyncClient();
            }
            return;
        }

        if (pauseChanged)
        {
            ticksSinceSave = 0;
            ticksSinceClientSync = 0;
            saveAndSyncClient();
            return;
        }

        if (ticksSinceSave >= SAVE_INTERVAL)
        {
            ticksSinceSave = 0;
            setChanged();
        }

        if (ticksSinceClientSync >= CLIENT_SYNC_INTERVAL)
        {
            ticksSinceClientSync = 0;
            syncClient();
        }
    }

    private boolean ensureMobVariant(ServerLevel level, BlockPos pos)
    {
        if (mobVariantReady)
        {
            return true;
        }

        CompoundTag variant = MobSeedVariant.create(level, pos, getEntityType());
        if (variant == null)
        {
            return false;
        }

        setMobVariant(variant);
        mobVariantReady = true;
        saveAndSyncClient();
        return true;
    }

    private void setMobVariant(CompoundTag variant)
    {
        mobVariant = variant;
        mobVariantKey = variant.toString();
    }

    private int getElapsedTicks(long currentTick)
    {
        if (lastGrowthTick < 0)
        {
            lastGrowthTick = currentTick;
            return 0;
        }

        long elapsedTicks = currentTick - lastGrowthTick;
        lastGrowthTick = currentTick;
        return (int) Math.min(GROWTH_CHECK_INTERVAL, Math.max(0, elapsedTicks));
    }

    private boolean hasPlayerNearby(ServerLevel level, BlockPos pos, int distance)
    {
        double centerX = pos.getX() + 0.5D;
        double centerY = pos.getY() + 0.5D;
        double centerZ = pos.getZ() + 0.5D;

        for (Player player : level.players())
        {
            if (Math.abs(player.getX() - centerX) <= distance
                    && Math.abs(player.getY() - centerY) <= distance
                    && Math.abs(player.getZ() - centerZ) <= distance)
            {
                return true;
            }
        }

        return false;
    }

    private boolean spawnMob(ServerLevel level, BlockPos pos, BlockState state)
    {
        Mob mob = getEntityType().create(level, EntitySpawnReason.EVENT);
        if (mob == null)
        {
            return false;
        }

        double spawnX = pos.getX() + 0.5D;
        double spawnY = pos.getY();
        double spawnZ = pos.getZ() + 0.5D;
        float rotation = state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot();
        mob.setPos(spawnX, spawnY, spawnZ);
        EventHooks.finalizeMobSpawn(mob, level, level.getCurrentDifficultyAt(pos), EntitySpawnReason.EVENT, null);

        if (MobSeedVariant.loadVariant(mob, mobVariant))
        {
            mob.setPos(spawnX, spawnY, spawnZ);
            mob.setYRot(rotation);
            mob.yRotO = rotation;
            mob.yBodyRot = rotation;
            mob.yBodyRotO = rotation;
            mob.yHeadRot = rotation;
            mob.yHeadRotO = rotation;

            if (mob instanceof AgeableMob ageableMob)
            {
                ageableMob.setBaby(true);
            }

            if (level.addFreshEntity(mob))
            {
                level.setBlock(pos, state.getValue(MobSeedBlock.WATERLOGGED) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
                level.playSound(null, pos, SoundType.GRASS.getPlaceSound(), SoundSource.NEUTRAL, 1.0F, 1.0F);
                return true;
            }
        }

        return false;
    }

    private void saveAndSyncClient()
    {
        setChanged();
        syncClient();
    }

    private void syncClient()
    {
        if (level != null && !level.isClientSide())
        {
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), Block.UPDATE_CLIENTS);
        }
    }

    private MobSeedBlock getSeedBlock()
    {
        return (MobSeedBlock) getBlockState().getBlock();
    }

    public int getRemainingTime()
    {
        return Math.max(0, spawnTimer);
    }

    public float getGrowthScale(float partialTick)
    {
        double remainingTime = spawnTimer;
        if (level != null && level.isClientSide() && !growthPaused && clientSyncGameTime >= 0)
        {
            remainingTime -= Math.max(0L, level.getGameTime() - clientSyncGameTime) + partialTick;
        }

        float growth = 1.0F - ((float) Math.max(0.0D, remainingTime) / Math.max(1, maxGrowthTime));
        return 0.1F + 0.9F * Math.max(0.0F, Math.min(1.0F, growth));
    }

    public EntityType<? extends Mob> getEntityType()
    {
        return getSeedBlock().getEntityType();
    }

    public boolean isMobVariantReady()
    {
        return mobVariantReady;
    }

    public CompoundTag getMobVariant()
    {
        return mobVariant;
    }

    public String getMobVariantKey()
    {
        return mobVariantKey;
    }

    @Override
    public void onLoad()
    {
        super.onLoad();
        if (level instanceof ServerLevel serverLevel)
        {
            lastGrowthTick = serverLevel.getGameTime();
            ensureMobVariant(serverLevel, worldPosition);
            int delay = 1 + Math.floorMod(worldPosition.hashCode(), GROWTH_CHECK_INTERVAL);
            serverLevel.scheduleTick(worldPosition, getBlockState().getBlock(), delay);
        }
        else if (level != null && level.isClientSide())
        {
            clientSyncGameTime = level.getGameTime();
        }
    }

    @Override
    public void onChunkUnloaded()
    {
        lastGrowthTick = -1;
    }

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket()
    {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public void onDataPacket(Connection connection, ValueInput input)
    {
        handleUpdateTag(input);
    }

    @Override
    public void loadAdditional(ValueInput input)
    {
        super.loadAdditional(input);
        maxGrowthTime = Math.max(1, input.getIntOr("MaxGrowthTime", getSeedBlock().getGrowthTime()));
        spawnTimer = input.getIntOr("SpawnTimer", maxGrowthTime);
        growthPaused = input.getBooleanOr("GrowthPaused", false);
        mobVariantReady = input.getBooleanOr("MobVariantReady", false);
        setMobVariant(input.read("MobVariant", CompoundTag.CODEC).orElseGet(CompoundTag::new));
        if (level != null && level.isClientSide())
        {
            clientSyncGameTime = level.getGameTime();
        }
    }

    @Override
    protected void saveAdditional(ValueOutput output)
    {
        super.saveAdditional(output);
        output.putInt("MaxGrowthTime", maxGrowthTime);
        output.putInt("SpawnTimer", spawnTimer);
        output.putBoolean("GrowthPaused", growthPaused);
        output.putBoolean("MobVariantReady", mobVariantReady);
        if (!mobVariant.isEmpty())
        {
            output.store("MobVariant", CompoundTag.CODEC, mobVariant);
        }
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries)
    {
        return saveWithoutMetadata(registries);
    }
}