package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.level.block.state.BlockState;

public class LlamaSeedEntity extends MobSeedEntity<Llama> {
    public LlamaSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.llama_seed_tile.get(), pos, state, CommonConfig.llamaSeedSpawnTimer.get(), EntityType.LLAMA, CommonConfig.llamaSeedSpawnTimer.get());
    }
}
