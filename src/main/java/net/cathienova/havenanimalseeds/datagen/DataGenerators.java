package net.cathienova.havenanimalseeds.datagen;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.datagen.recipes.ModRecipeProvider;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = HavenAnimalSeeds.MOD_ID, value = Dist.CLIENT)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event)
    {
        event.createProvider(ModEngLangProvider::new);
        event.createProvider(ModModelProvider::new);
        event.createProvider(ModRecipeProvider.Runner::new);
        event.createProvider(ModBlockTagGenerator::new);
        event.createProvider(ModItemTagGenerator::new);
    }
}