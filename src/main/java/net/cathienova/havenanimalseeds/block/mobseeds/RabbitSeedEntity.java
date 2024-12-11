package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.level.block.state.BlockState;

public class RabbitSeedEntity extends MobSeedEntity<Rabbit> {
    public RabbitSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.rabbit_seed_tile.get(), pos, state, CommonConfig.rabbitSeedSpawnTimer.get(), EntityType.RABBIT, CommonConfig.rabbitSeedSpawnTimer.get());
    }
}
