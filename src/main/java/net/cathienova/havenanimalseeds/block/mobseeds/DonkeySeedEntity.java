package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.Donkey;
import net.minecraft.world.level.block.state.BlockState;

public class DonkeySeedEntity extends MobSeedEntity<Donkey> {
    public DonkeySeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.donkey_seed_tile.get(), pos, state, CommonConfig.donkeySeedSpawnTimer.get(), EntityType.DONKEY, CommonConfig.donkeySeedSpawnTimer.get());
    }
}
