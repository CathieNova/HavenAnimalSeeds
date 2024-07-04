package net.cathienova.havenanimalseeds.compat.jade;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.cathienova.havenanimalseeds.block.mobseeds.MobSeedEntity;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IServerDataProvider;

public enum MobSeedDataProvider implements IServerDataProvider<BlockAccessor> {
    INSTANCE;

    @Override
    public void appendServerData(CompoundTag data, BlockAccessor accessor) {
        MobSeedEntity<?> mobSeedEntity = (MobSeedEntity<?>) accessor.getBlockEntity();
        if (mobSeedEntity != null) {
            data.putInt("RemainingTime", mobSeedEntity.getRemainingTime() / 20);
        }
    }

    @Override
    public ResourceLocation getUid() {
        return new ResourceLocation("havenanimalseeds", "mobseed_remaining_time");
    }
}
