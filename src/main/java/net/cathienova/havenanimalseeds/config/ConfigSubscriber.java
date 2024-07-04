package net.cathienova.havenanimalseeds.config;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = HavenAnimalSeeds.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConfigSubscriber {
    @SubscribeEvent
    public static void onModConfigEvent(final ModConfigEvent event) {
        HavenConfig.bake(event.getConfig());
    }
}
