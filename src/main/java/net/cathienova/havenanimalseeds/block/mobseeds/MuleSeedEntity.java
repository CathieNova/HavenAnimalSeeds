package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.Mule;
import net.minecraft.world.level.block.state.BlockState;

public class MuleSeedEntity extends MobSeedEntity<Mule> {
    public MuleSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.mule_seed_tile.get(), pos, state, HavenConfig.mule_seed_spawn_timer, EntityType.MULE, HavenConfig.mule_seed_spawn_timer);
    }
}
