package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.level.block.state.BlockState;

public class BeeSeedEntity extends MobSeedEntity<Bee> {
    public BeeSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.bee_seed_tile.get(), pos, state, CommonConfig.beeSeedSpawnTimer.get(), EntityType.BEE, CommonConfig.beeSeedSpawnTimer.get());
    }
}
