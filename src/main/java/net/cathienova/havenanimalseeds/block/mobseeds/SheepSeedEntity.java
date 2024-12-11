package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.level.block.state.BlockState;

public class SheepSeedEntity extends MobSeedEntity<Sheep> {
    public SheepSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.sheep_seed_tile.get(), pos, state, CommonConfig.sheepSeedSpawnTimer.get(), EntityType.SHEEP, CommonConfig.sheepSeedSpawnTimer.get());
    }
}
