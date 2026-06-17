package net.cathienova.havenanimalseeds.block;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.mobseeds.MobSeedEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities
{
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, HavenAnimalSeeds.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MobSeedEntity>> mob_seed = BLOCK_ENTITIES.register("mob_seed",
            () -> new BlockEntityType<>(MobSeedEntity::new, ModBlocks.getMobSeeds().stream().map(seed -> (Block) seed.get()).toArray(Block[]::new)));

    public static void register(IEventBus eventBus)
    {
        BLOCK_ENTITIES.register(eventBus);
    }
}