package net.cathienova.havenanimalseeds.item;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HavenAnimalSeeds.MOD_ID);

    public static String HavenAnimalSeeds_tab_title = "itemgroup.havenanimalseeds.havenanimalseeds_tab";
    public static final Supplier<CreativeModeTab> Haven_TAB = CREATIVE_MODE_TABS.register("havenanimalseeds_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.chicken_seed.get()))
                    .title(Component.translatable(HavenAnimalSeeds_tab_title))
                    .displayItems((parameters, output) -> ModBlocks.getMobSeeds().forEach(seed -> output.accept(new ItemStack(seed.get().asItem()))))
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}