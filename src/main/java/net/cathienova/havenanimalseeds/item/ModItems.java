package net.cathienova.havenanimalseeds.item;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HavenAnimalSeeds.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}