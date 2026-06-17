package net.cathienova.havenanimalseeds.util;

import com.mojang.blaze3d.vertex.PoseStack;
import net.cathienova.havenanimalseeds.block.mobseeds.MobSeedEntity;
import net.cathienova.havenanimalseeds.block.mobseeds.MobSeedVariant;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.Vec3;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class MobSeedRenderer implements BlockEntityRenderer<MobSeedEntity, MobSeedRenderState>
{
    private static MobSeedRenderer activeRenderer;

    private final EntityRenderDispatcher dispatcher;
    private final Map<EntityType<?>, Map<String, Mob>> mobModels = new IdentityHashMap<>();
    private Level modelLevel;

    public MobSeedRenderer(BlockEntityRendererProvider.Context context)
    {
        dispatcher = Minecraft.getInstance().getEntityRenderDispatcher();
        activeRenderer = this;
    }

    public static void clearModels(LevelAccessor level)
    {
        if (activeRenderer != null && activeRenderer.modelLevel == level)
        {
            activeRenderer.clearModels();
        }
    }

    private void clearModels()
    {
        mobModels.clear();
        modelLevel = null;
    }

    @Override
    public MobSeedRenderState createRenderState()
    {
        return new MobSeedRenderState();
    }

    @Override
    public void extractRenderState(MobSeedEntity blockEntity, MobSeedRenderState renderState, float partialTick, Vec3 cameraPos, ModelFeatureRenderer.@org.jspecify.annotations.Nullable CrumblingOverlay crumblingOverlay)
    {
        BlockEntityRenderer.super.extractRenderState(blockEntity, renderState, partialTick, cameraPos, crumblingOverlay);
        Level level = blockEntity.getLevel();
        if (level == null || !blockEntity.isMobVariantReady())
        {
            renderState.mobRenderState = null;
            return;
        }

        if (modelLevel != level)
        {
            clearModels();
            modelLevel = level;
        }

        Mob mob = getMobModel(blockEntity.getEntityType(), level, blockEntity.getMobVariantKey(), blockEntity.getMobVariant());
        if (mob == null)
        {
            renderState.mobRenderState = null;
            return;
        }

        double modelX = blockEntity.getBlockPos().getX() + 0.5D;
        double modelY = blockEntity.getBlockPos().getY();
        double modelZ = blockEntity.getBlockPos().getZ() + 0.5D;
        mob.setPos(modelX, modelY, modelZ);
        mob.xo = modelX;
        mob.yo = modelY;
        mob.zo = modelZ;
        mob.setDeltaMovement(Vec3.ZERO);
        mob.tickCount = 0;

        Direction facing = blockEntity.getBlockState().getValue(BlockStateProperties.HORIZONTAL_FACING);
        float rotation = facing.toYRot();
        mob.setYRot(rotation);
        mob.yRotO = rotation;
        mob.yBodyRot = rotation;
        mob.yBodyRotO = rotation;
        mob.yHeadRot = rotation;
        mob.yHeadRotO = rotation;
        mob.setXRot(0.0F);
        mob.xRotO = 0.0F;

        renderState.mobRenderState = dispatcher.extractEntity(mob, 0.0F);
        renderState.growthScale = blockEntity.getGrowthScale(partialTick);
    }

    private Mob getMobModel(EntityType<? extends Mob> entityType, Level level, String variantKey, CompoundTag variant)
    {
        Map<String, Mob> variants = mobModels.computeIfAbsent(entityType, ignored -> new HashMap<>());
        Mob mob = variants.get(variantKey);
        if (mob != null)
        {
            return mob;
        }

        mob = entityType.create(level, EntitySpawnReason.EVENT);
        if (mob == null)
        {
            return null;
        }

        if (MobSeedVariant.loadVariant(mob, variant))
        {
            if (mob instanceof AgeableMob ageableMob)
            {
                ageableMob.setBaby(true);
            }

            mob.setInvulnerable(true);
            mob.setNoAi(true);
            mob.setNoGravity(true);
            mob.tickCount = 0;
            variants.put(variantKey, mob);
            return mob;
        }

        return null;
    }

    @Override
    public void submit(MobSeedRenderState renderState, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState cameraState)
    {
        if (renderState.mobRenderState == null)
        {
            return;
        }

        poseStack.pushPose();
        poseStack.translate(0.5D, 0.0D, 0.5D);
        poseStack.scale(renderState.growthScale, renderState.growthScale, renderState.growthScale);
        dispatcher.submit(renderState.mobRenderState, cameraState, 0.0D, 0.0D, 0.0D, poseStack, collector);
        poseStack.popPose();
    }

    @Override
    public int getViewDistance()
    {
        return HavenConfig.seed_model_render_distance;
    }
}