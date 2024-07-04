package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.level.block.state.BlockState;

public class RabbitSeedEntity extends MobSeedEntity<Rabbit> {
    public RabbitSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.rabbit_seed_tile.get(), pos, state, HavenConfig.rabbit_seed_spawn_timer, EntityType.RABBIT, HavenConfig.rabbit_seed_spawn_timer);
    }
}
