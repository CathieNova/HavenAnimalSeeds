package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.level.block.state.BlockState;

public class SquidSeedEntity extends MobSeedEntity<Squid> {
    public SquidSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.squid_seed_tile.get(), pos, state, HavenConfig.squid_seed_spawn_timer, EntityType.SQUID, HavenConfig.squid_seed_spawn_timer);
    }
}
