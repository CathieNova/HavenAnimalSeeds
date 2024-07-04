package net.cathienova.havenanimalseeds.block;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.mobseeds.*;
import net.cathienova.havenanimalseeds.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HavenAnimalSeeds.MOD_ID);

    public static final RegistryObject<Block> axolotl_seed = registerBlock("axolotl_seed",
            () -> new AxolotlSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> bee_seed = registerBlock("bee_seed",
            () -> new BeeSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> cat_seed = registerBlock("cat_seed",
            () -> new CatSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> chicken_seed = registerBlock("chicken_seed",
            () -> new ChickenSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> cow_seed = registerBlock("cow_seed",
            () -> new CowSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> donkey_seed = registerBlock("donkey_seed",
            () -> new DonkeySeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> fox_seed = registerBlock("fox_seed",
            () -> new FoxSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> goat_seed = registerBlock("goat_seed",
            () -> new GoatSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> horse_seed = registerBlock("horse_seed",
            () -> new HorseSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> llama_seed = registerBlock("llama_seed",
            () -> new LlamaSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> mooshroom_seed = registerBlock("mooshroom_seed",
            () -> new MooshroomSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> mule_seed = registerBlock("mule_seed",
            () -> new MuleSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> ocelot_seed = registerBlock("ocelot_seed",
            () -> new OcelotSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> panda_seed = registerBlock("panda_seed",
            () -> new PandaSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> pig_seed = registerBlock("pig_seed",
            () -> new PigSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> rabbit_seed = registerBlock("rabbit_seed",
            () -> new RabbitSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> sheep_seed = registerBlock("sheep_seed",
            () -> new SheepSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> sniffer_seed = registerBlock("sniffer_seed",
            () -> new SnifferSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> turtle_seed = registerBlock("turtle_seed",
            () -> new TurtleSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> parrot_seed = registerBlock("parrot_seed",
            () -> new ParrotSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> wolf_seed = registerBlock("wolf_seed",
            () -> new WolfSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> dolphin_seed = registerBlock("dolphin_seed",
            () -> new DolphinSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> glow_squid_seed = registerBlock("glow_squid_seed",
            () -> new GlowSquidSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> polar_bear_seed = registerBlock("polar_bear_seed",
            () -> new PolarBearSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> squid_seed = registerBlock("squid_seed",
            () -> new SquidSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> villager_seed = registerBlock("villager_seed",
            () -> new VillagerSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerFuelBlockBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
