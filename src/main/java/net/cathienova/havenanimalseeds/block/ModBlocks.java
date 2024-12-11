package net.cathienova.havenanimalseeds.block;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.mobseeds.*;
import net.cathienova.havenanimalseeds.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(HavenAnimalSeeds.MOD_ID);

    public static final DeferredBlock<Block> axolotl_seed = registerBlock("axolotl_seed",
            () -> new AxolotlSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> bee_seed = registerBlock("bee_seed",
            () -> new BeeSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> cat_seed = registerBlock("cat_seed",
            () -> new CatSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> chicken_seed = registerBlock("chicken_seed",
            () -> new ChickenSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> cow_seed = registerBlock("cow_seed",
            () -> new CowSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> donkey_seed = registerBlock("donkey_seed",
            () -> new DonkeySeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> fox_seed = registerBlock("fox_seed",
            () -> new FoxSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> goat_seed = registerBlock("goat_seed",
            () -> new GoatSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> horse_seed = registerBlock("horse_seed",
            () -> new HorseSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> llama_seed = registerBlock("llama_seed",
            () -> new LlamaSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> mooshroom_seed = registerBlock("mooshroom_seed",
            () -> new MooshroomSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> mule_seed = registerBlock("mule_seed",
            () -> new MuleSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> ocelot_seed = registerBlock("ocelot_seed",
            () -> new OcelotSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> panda_seed = registerBlock("panda_seed",
            () -> new PandaSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> pig_seed = registerBlock("pig_seed",
            () -> new PigSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> rabbit_seed = registerBlock("rabbit_seed",
            () -> new RabbitSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> sheep_seed = registerBlock("sheep_seed",
            () -> new SheepSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> sniffer_seed = registerBlock("sniffer_seed",
            () -> new SnifferSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> turtle_seed = registerBlock("turtle_seed",
            () -> new TurtleSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> parrot_seed = registerBlock("parrot_seed",
            () -> new ParrotSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> wolf_seed = registerBlock("wolf_seed",
            () -> new WolfSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> dolphin_seed = registerBlock("dolphin_seed",
            () -> new DolphinSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> glow_squid_seed = registerBlock("glow_squid_seed",
            () -> new GlowSquidSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> polar_bear_seed = registerBlock("polar_bear_seed",
            () -> new PolarBearSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> squid_seed = registerBlock("squid_seed",
            () -> new SquidSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    public static final DeferredBlock<Block> villager_seed = registerBlock("villager_seed",
            () -> new VillagerSeedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noLootTable()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
