package net.cathienova.havenanimalseeds.compat.jade;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.mobseeds.MobSeedEntity;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Player;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IServerDataProvider;

public enum MobSeedDataProvider implements IServerDataProvider<BlockAccessor>
{
    INSTANCE;

    @Override
    public void appendServerData(CompoundTag data, BlockAccessor accessor)
    {
        if (accessor.getBlockEntity() instanceof MobSeedEntity mobSeedEntity)
        {
            data.putInt("RemainingTime", mobSeedEntity.getRemainingTime() / 20);

            Player player = accessor.getPlayer();
            data.putBoolean("PlayerTooClose", player != null && isPlayerTooClose(player, accessor.getPosition(), HavenConfig.playerGrowthDistance));
        }
    }

    private boolean isPlayerTooClose(Player player, BlockPos pos, int distance)
    {
        double centerX = pos.getX() + 0.5D;
        double centerY = pos.getY() + 0.5D;
        double centerZ = pos.getZ() + 0.5D;
        return Math.abs(player.getX() - centerX) <= distance
                && Math.abs(player.getY() - centerY) <= distance
                && Math.abs(player.getZ() - centerZ) <= distance;
    }

    @Override
    public Identifier getUid()
    {
        return Identifier.fromNamespaceAndPath(HavenAnimalSeeds.MOD_ID, "mobseed_remaining_time");
    }
}
