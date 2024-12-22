package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.sniffer.Sniffer;
import net.minecraft.world.level.block.state.BlockState;

public class SnifferSeedEntity extends MobSeedEntity<Sniffer> {
    public SnifferSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.sniffer_seed_tile.get(), pos, state, HavenConfig.sniffer_seed_spawn_timer, EntityType.SNIFFER, HavenConfig.sniffer_seed_spawn_timer);
    }
}
