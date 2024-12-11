package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.level.block.state.BlockState;

public class ParrotSeedEntity extends MobSeedEntity<Parrot> {
    public ParrotSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.parrot_seed_tile.get(), pos, state, CommonConfig.parrotSeedSpawnTimer.get(), EntityType.PARROT, CommonConfig.parrotSeedSpawnTimer.get());
    }
}
