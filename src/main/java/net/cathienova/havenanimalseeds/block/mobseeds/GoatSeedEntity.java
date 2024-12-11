package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.level.block.state.BlockState;

public class GoatSeedEntity extends MobSeedEntity<Goat> {
    public GoatSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.goat_seed_tile.get(), pos, state, CommonConfig.goatSeedSpawnTimer.get(), EntityType.GOAT, CommonConfig.goatSeedSpawnTimer.get());
    }
}
