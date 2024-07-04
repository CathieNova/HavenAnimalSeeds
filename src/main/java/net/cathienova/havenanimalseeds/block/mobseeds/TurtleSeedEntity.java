package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.level.block.state.BlockState;

public class TurtleSeedEntity extends MobSeedEntity<Turtle> {
    public TurtleSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.turtle_seed_tile.get(), pos, state, HavenConfig.turtle_seed_spawn_timer, EntityType.TURTLE, HavenConfig.turtle_seed_spawn_timer);
    }
}
