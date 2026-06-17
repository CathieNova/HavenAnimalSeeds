package net.cathienova.havenanimalseeds.block;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.mobseeds.MobSeedBlock;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.cathienova.havenanimalseeds.item.MobSeedItem;
import net.cathienova.havenanimalseeds.item.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.IntSupplier;

public class ModBlocks
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(HavenAnimalSeeds.MOD_ID);

    public static final DeferredBlock<MobSeedBlock> axolotl_seed = registerWaterSeed("axolotl_seed", EntityType.AXOLOTL, () -> HavenConfig.axolotl_seed_spawn_timer);
    public static final DeferredBlock<MobSeedBlock> bee_seed = registerGroundSeed("bee_seed", EntityType.BEE, () -> HavenConfig.bee_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> cat_seed = registerGroundSeed("cat_seed", EntityType.CAT, () -> HavenConfig.cat_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> chicken_seed = registerGroundSeed("chicken_seed", EntityType.CHICKEN, () -> HavenConfig.chicken_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL, Blocks.MOSS_BLOCK);
    public static final DeferredBlock<MobSeedBlock> cow_seed = registerGroundSeed("cow_seed", EntityType.COW, () -> HavenConfig.cow_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> donkey_seed = registerGroundSeed("donkey_seed", EntityType.DONKEY, () -> HavenConfig.donkey_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL, Blocks.COARSE_DIRT, Blocks.DIRT);
    public static final DeferredBlock<MobSeedBlock> fox_seed = registerGroundSeed("fox_seed", EntityType.FOX, () -> HavenConfig.fox_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL, Blocks.SNOW_BLOCK);
    public static final DeferredBlock<MobSeedBlock> goat_seed = registerGroundSeed("goat_seed", EntityType.GOAT, () -> HavenConfig.goat_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL, Blocks.SNOW_BLOCK, Blocks.STONE, Blocks.COBBLESTONE, Blocks.MOSSY_COBBLESTONE, Blocks.GRANITE, Blocks.ANDESITE, Blocks.DIORITE, Blocks.GRAVEL);
    public static final DeferredBlock<MobSeedBlock> horse_seed = registerGroundSeed("horse_seed", EntityType.HORSE, () -> HavenConfig.horse_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> llama_seed = registerGroundSeed("llama_seed", EntityType.LLAMA, () -> HavenConfig.llama_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> mooshroom_seed = registerGroundSeed("mooshroom_seed", EntityType.MOOSHROOM, () -> HavenConfig.mooshroom_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.MYCELIUM, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> mule_seed = registerGroundSeed("mule_seed", EntityType.MULE, () -> HavenConfig.mule_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> ocelot_seed = registerGroundSeed("ocelot_seed", EntityType.OCELOT, () -> HavenConfig.ocelot_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> panda_seed = registerGroundSeed("panda_seed", EntityType.PANDA, () -> HavenConfig.panda_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> pig_seed = registerGroundSeed("pig_seed", EntityType.PIG, () -> HavenConfig.pig_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL, Blocks.COARSE_DIRT, Blocks.DIRT, Blocks.MOSS_BLOCK, Blocks.MYCELIUM, Blocks.ROOTED_DIRT);
    public static final DeferredBlock<MobSeedBlock> rabbit_seed = registerGroundSeed("rabbit_seed", EntityType.RABBIT, () -> HavenConfig.rabbit_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL, Blocks.SAND, Blocks.RED_SAND, Blocks.SANDSTONE);
    public static final DeferredBlock<MobSeedBlock> sheep_seed = registerGroundSeed("sheep_seed", EntityType.SHEEP, () -> HavenConfig.sheep_seed_spawn_timer, Blocks.GRASS_BLOCK);
    public static final DeferredBlock<MobSeedBlock> sniffer_seed = registerGroundSeed("sniffer_seed", EntityType.SNIFFER, () -> HavenConfig.sniffer_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> parrot_seed = registerGroundSeed("parrot_seed", EntityType.PARROT, () -> HavenConfig.parrot_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> turtle_seed = registerGroundAndWaterSeed("turtle_seed", EntityType.TURTLE, () -> HavenConfig.turtle_seed_spawn_timer, Blocks.SAND);
    public static final DeferredBlock<MobSeedBlock> wolf_seed = registerGroundSeed("wolf_seed", EntityType.WOLF, () -> HavenConfig.wolf_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> dolphin_seed = registerWaterSeed("dolphin_seed", EntityType.DOLPHIN, () -> HavenConfig.dolphin_seed_spawn_timer);
    public static final DeferredBlock<MobSeedBlock> glow_squid_seed = registerWaterSeed("glow_squid_seed", EntityType.GLOW_SQUID, () -> HavenConfig.glow_squid_seed_spawn_timer);
    public static final DeferredBlock<MobSeedBlock> polar_bear_seed = registerGroundSeed("polar_bear_seed", EntityType.POLAR_BEAR, () -> HavenConfig.polar_bear_seed_spawn_timer, Blocks.SNOW_BLOCK, Blocks.ICE, Blocks.PACKED_ICE, Blocks.BLUE_ICE);
    public static final DeferredBlock<MobSeedBlock> squid_seed = registerWaterSeed("squid_seed", EntityType.SQUID, () -> HavenConfig.squid_seed_spawn_timer);
    public static final DeferredBlock<MobSeedBlock> villager_seed = registerGroundSeed("villager_seed", EntityType.VILLAGER, () -> HavenConfig.villager_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> allay_seed = registerGroundSeed("allay_seed", EntityType.ALLAY, () -> HavenConfig.allay_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL);
    public static final DeferredBlock<MobSeedBlock> armadillo_seed = registerGroundSeed("armadillo_seed", EntityType.ARMADILLO, () -> HavenConfig.armadillo_seed_spawn_timer, Blocks.GRASS_BLOCK, Blocks.PODZOL, Blocks.COARSE_DIRT, Blocks.DIRT);
    public static final DeferredBlock<MobSeedBlock> camel_seed = registerGroundSeed("camel_seed", EntityType.CAMEL, () -> HavenConfig.camel_seed_spawn_timer, Blocks.SAND, Blocks.RED_SAND);
    public static final DeferredBlock<MobSeedBlock> nautilus_seed = registerWaterSeed("nautilus_seed", EntityType.NAUTILUS, () -> HavenConfig.nautilus_seed_spawn_timer);

    private static final List<DeferredBlock<MobSeedBlock>> MOB_SEEDS = List.of(
            axolotl_seed,
            bee_seed,
            cat_seed,
            chicken_seed,
            cow_seed,
            donkey_seed,
            fox_seed,
            goat_seed,
            horse_seed,
            llama_seed,
            mooshroom_seed,
            mule_seed,
            ocelot_seed,
            panda_seed,
            pig_seed,
            rabbit_seed,
            sheep_seed,
            sniffer_seed,
            parrot_seed,
            turtle_seed,
            wolf_seed,
            dolphin_seed,
            glow_squid_seed,
            polar_bear_seed,
            squid_seed,
            villager_seed,
            allay_seed,
            armadillo_seed,
            camel_seed,
            nautilus_seed
    );

    private static DeferredBlock<MobSeedBlock> registerGroundSeed(String name, EntityType<? extends Mob> entityType, IntSupplier growthTime, Block... placementBlocks)
    {
        return registerSeed(name, entityType, growthTime, true, false, placementBlocks);
    }

    private static DeferredBlock<MobSeedBlock> registerWaterSeed(String name, EntityType<? extends Mob> entityType, IntSupplier growthTime)
    {
        return registerSeed(name, entityType, growthTime, false, true);
    }

    private static DeferredBlock<MobSeedBlock> registerGroundAndWaterSeed(String name, EntityType<? extends Mob> entityType, IntSupplier growthTime, Block... placementBlocks)
    {
        return registerSeed(name, entityType, growthTime, true, true, placementBlocks);
    }

    private static DeferredBlock<MobSeedBlock> registerSeed(String name, EntityType<? extends Mob> entityType, IntSupplier growthTime, boolean canGrowOnBlocks, boolean canGrowInWater, Block... placementBlocks)
    {
        DeferredBlock<MobSeedBlock> block = BLOCKS.registerBlock(name,
                properties -> new MobSeedBlock(properties, entityType, growthTime, canGrowOnBlocks, canGrowInWater, placementBlocks),
                () -> BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable());
        ModItems.ITEMS.registerItem(name, properties -> new MobSeedItem(block.get(), properties.useBlockDescriptionPrefix()));
        return block;
    }

    public static List<DeferredBlock<MobSeedBlock>> getMobSeeds()
    {
        return MOB_SEEDS;
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}