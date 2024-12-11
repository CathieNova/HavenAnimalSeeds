package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.level.block.state.BlockState;

public class ChickenSeedEntity extends MobSeedEntity<Chicken> {
    public ChickenSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.chicken_seed_tile.get(), pos, state, CommonConfig.chickenSeedSpawnTimer.get(), EntityType.CHICKEN, CommonConfig.chickenSeedSpawnTimer.get());
    }
}
