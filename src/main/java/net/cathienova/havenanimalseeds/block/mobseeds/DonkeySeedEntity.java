package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.Donkey;
import net.minecraft.world.level.block.state.BlockState;

public class DonkeySeedEntity extends MobSeedEntity<Donkey> {
    public DonkeySeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.donkey_seed_tile.get(), pos, state, HavenConfig.donkey_seed_spawn_timer, EntityType.DONKEY, HavenConfig.donkey_seed_spawn_timer);
    }
}
