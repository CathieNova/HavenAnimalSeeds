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
import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

@Mod(HavenAnimalSeeds.MOD_ID)
public class HavenAnimalSeeds
{
    public static final String MOD_ID = "havenanimalseeds";
    public static final String MOD_NAME = "HavenAnimalSeeds";
    static final ModConfigSpec commonSpec;
    public static final CommonConfig c_config;

    static
    {
        final Pair<CommonConfig, ModConfigSpec> specPair = new ModConfigSpec.Builder().configure(CommonConfig::new);
        commonSpec = specPair.getRight();
        c_config = specPair.getLeft();
    }

    public HavenAnimalSeeds(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::setup);
        modContainer.registerConfig(ModConfig.Type.COMMON, commonSpec);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);
        DistUtils.runIfClient(HavenAnimalSeedsClient::new);
    }

    public static void Log(String message)
    {
        LogUtils.getLogger().info("["+ MOD_NAME +"] " + message);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }
}
