package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Panda;
import net.minecraft.world.level.block.state.BlockState;

public class PandaSeedEntity extends MobSeedEntity<Panda> {
    public PandaSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.panda_seed_tile.get(), pos, state, CommonConfig.pandaSeedSpawnTimer.get(), EntityType.PANDA, CommonConfig.pandaSeedSpawnTimer.get());
    }
}
