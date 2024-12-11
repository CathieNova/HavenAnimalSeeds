package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.MushroomCow;
import net.minecraft.world.level.block.state.BlockState;

public class MooshroomSeedEntity extends MobSeedEntity<MushroomCow> {
    public MooshroomSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.mooshroom_seed_tile.get(), pos, state, CommonConfig.mooshroomSeedSpawnTimer.get(), EntityType.MOOSHROOM, CommonConfig.mooshroomSeedSpawnTimer.get());
    }
}
