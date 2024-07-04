package net.cathienova.havenanimalseeds.item;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HavenAnimalSeeds.MOD_ID);

    public static String HavenAnimalSeeds_tab_title = "itemgroup.havenksh.havenanimalseeds_tab";
    public static final RegistryObject<CreativeModeTab> Haven_TAB = CREATIVE_MODE_TABS.register("havenanimalseeds_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.chicken_seed.get()))
                    .title(Component.translatable(HavenAnimalSeeds_tab_title))
                    .displayItems((pParameters, add) -> {
                        add.accept(new ItemStack(ModBlocks.axolotl_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.bee_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.cat_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.chicken_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.cow_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.donkey_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.fox_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.goat_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.horse_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.llama_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.mooshroom_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.mule_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.pig_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.rabbit_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.sheep_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.sniffer_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.parrot_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.turtle_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.wolf_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.dolphin_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.glow_squid_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.polar_bear_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.squid_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.villager_seed.get().asItem()));
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
