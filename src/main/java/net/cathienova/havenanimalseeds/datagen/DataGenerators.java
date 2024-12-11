package net.cathienova.havenanimalseeds.datagen;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class DataGenerators {
    @EventBusSubscriber(modid = HavenAnimalSeeds.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
    public static class ModRecipeProvider {
        @SubscribeEvent
        public static void gatherData(GatherDataEvent event) {
            DataGenerator generator = event.getGenerator();
            PackOutput output = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
            CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

            boolean includeClient = event.includeClient();
            boolean includeServer = event.includeServer();

            if (includeClient) {
                generator.addProvider(includeClient, new ModEngLangProvider(output));
                generator.addProvider(includeClient, new ModBlockStateProvider(output, existingFileHelper));
            }

            if (includeServer) {
                generator.addProvider(includeServer, new net.cathienova.havenanimalseeds.datagen.recipes.ModRecipeProvider(output, lookupProvider));

                ModBlockTagGenerator blockTagGenerator = generator.addProvider(includeServer, new ModBlockTagGenerator(output, lookupProvider, existingFileHelper));
                generator.addProvider(includeServer, new ModItemTagGenerator(output, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

                generator.addProvider(includeServer, new ModAdvancementProvider(output, lookupProvider, existingFileHelper));
            }
        }
    }
}
