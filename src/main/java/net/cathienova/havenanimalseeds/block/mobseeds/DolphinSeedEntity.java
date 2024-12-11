package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Dolphin;
import net.minecraft.world.level.block.state.BlockState;

public class DolphinSeedEntity extends MobSeedEntity<Dolphin> {
    public DolphinSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.dolphin_seed_tile.get(), pos, state, CommonConfig.dolphinSeedSpawnTimer.get(), EntityType.DOLPHIN, CommonConfig.dolphinSeedSpawnTimer.get());
    }
}
