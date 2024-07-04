package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.GlowSquid;
import net.minecraft.world.level.block.state.BlockState;

public class GlowSquidSeedEntity extends MobSeedEntity<GlowSquid> {
    public GlowSquidSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.glow_squid_seed_tile.get(), pos, state, HavenConfig.glow_squid_seed_spawn_timer, EntityType.GLOW_SQUID, HavenConfig.glow_squid_seed_spawn_timer);
    }
}
