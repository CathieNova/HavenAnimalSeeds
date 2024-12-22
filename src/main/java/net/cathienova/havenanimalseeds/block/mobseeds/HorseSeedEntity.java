package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.level.block.state.BlockState;

public class HorseSeedEntity extends MobSeedEntity<Horse> {
    public HorseSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.horse_seed_tile.get(), pos, state, HavenConfig.horse_seed_spawn_timer, EntityType.HORSE, HavenConfig.horse_seed_spawn_timer);
    }
}
