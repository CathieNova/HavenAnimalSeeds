package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.level.block.state.BlockState;

public class HorseSeedEntity extends MobSeedEntity<Horse> {
    public HorseSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.horse_seed_tile.get(), pos, state, CommonConfig.horseSeedSpawnTimer.get(), EntityType.HORSE, CommonConfig.horseSeedSpawnTimer.get());
    }
}
