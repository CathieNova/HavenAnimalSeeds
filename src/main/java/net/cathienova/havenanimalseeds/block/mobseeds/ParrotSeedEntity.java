package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.level.block.state.BlockState;

public class ParrotSeedEntity extends MobSeedEntity<Parrot> {
    public ParrotSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.parrot_seed_tile.get(), pos, state, HavenConfig.parrot_seed_spawn_timer, EntityType.PARROT, HavenConfig.parrot_seed_spawn_timer);
    }
}
