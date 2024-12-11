package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.level.block.state.BlockState;

public class FoxSeedEntity extends MobSeedEntity<Fox> {
    public FoxSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.fox_seed_tile.get(), pos, state, CommonConfig.foxSeedSpawnTimer.get(), EntityType.FOX, CommonConfig.foxSeedSpawnTimer.get());
    }
}
