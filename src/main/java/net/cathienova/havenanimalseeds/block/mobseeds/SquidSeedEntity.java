package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.level.block.state.BlockState;

public class SquidSeedEntity extends MobSeedEntity<Squid> {
    public SquidSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.squid_seed_tile.get(), pos, state, CommonConfig.squidSeedSpawnTimer.get(), EntityType.SQUID, CommonConfig.squidSeedSpawnTimer.get());
    }
}
