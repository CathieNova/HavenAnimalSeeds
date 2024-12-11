package net.cathienova.havenanimalseeds;

import com.mojang.logging.LogUtils;
import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.cathienova.havenanimalseeds.item.ModCreativeModTabs;
import net.cathienova.havenanimalseeds.item.ModItems;
import net.cathienova.havenanimalseeds.util.DistUtils;
import net.cathienova.havenanimalseeds.util.MobSeedRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(HavenAnimalSeeds.MOD_ID)
public class HavenAnimalSeeds
{
    public static final String MOD_ID = "havenanimalseeds";
    public static final String MOD_NAME = "HavenAnimalSeeds";

    public HavenAnimalSeeds(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::setup);
        modContainer.registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);
        DistUtils.runIfOn(Dist.CLIENT, MobSeedRenderer::new);
        DistUtils.runIfOn(Dist.CLIENT, HavenAnimalSeedsClient::new);
    }

    public static void Log(String message)
    {
        LogUtils.getLogger().info("["+ MOD_NAME +"] " + message);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }
}
