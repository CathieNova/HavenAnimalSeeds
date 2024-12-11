package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.level.block.state.BlockState;

public class VillagerSeedEntity extends MobSeedEntity<Villager> {
    public VillagerSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.villager_seed_tile.get(), pos, state, CommonConfig.villagerSeedSpawnTimer.get(), EntityType.VILLAGER, CommonConfig.villagerSeedSpawnTimer.get());
    }
}
