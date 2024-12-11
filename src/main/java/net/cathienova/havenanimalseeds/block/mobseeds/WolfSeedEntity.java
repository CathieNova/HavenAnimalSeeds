package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.level.block.state.BlockState;

public class WolfSeedEntity extends MobSeedEntity<Wolf> {
    public WolfSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.wolf_seed_tile.get(), pos, state, CommonConfig.wolfSeedSpawnTimer.get(), EntityType.WOLF, CommonConfig.wolfSeedSpawnTimer.get());
    }
}
