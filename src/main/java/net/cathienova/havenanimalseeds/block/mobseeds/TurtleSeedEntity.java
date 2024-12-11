package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.level.block.state.BlockState;

public class TurtleSeedEntity extends MobSeedEntity<Turtle> {
    public TurtleSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.turtle_seed_tile.get(), pos, state, CommonConfig.turtleSeedSpawnTimer.get(), EntityType.TURTLE, CommonConfig.turtleSeedSpawnTimer.get());
    }
}
