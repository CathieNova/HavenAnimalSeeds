package net.cathienova.havenanimalseeds;

import com.mojang.logging.LogUtils;
import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.cathienova.havenanimalseeds.item.ModCreativeModTabs;
import net.cathienova.havenanimalseeds.item.ModItems;
import net.cathienova.havenanimalseeds.util.MobSeedRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.commons.lang3.tuple.Pair;

@Mod(HavenAnimalSeeds.MOD_ID)
public class HavenAnimalSeeds
{
    public static final String MOD_ID = "havenanimalseeds";
    public static final String MOD_NAME = "HavenAnimalSeeds";
    static final ForgeConfigSpec commonSpec;
    public static final CommonConfig c_config;

    static {
        final Pair<CommonConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(CommonConfig::new);
        commonSpec = specPair.getRight();
        c_config = specPair.getLeft();
    }

    public HavenAnimalSeeds()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, commonSpec, MOD_NAME + "-Config.toml");
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> MobSeedRenderer::new);
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> HavenAnimalSeedsClient::new);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static void Log(String message)
    {
        LogUtils.getLogger().info("["+ MOD_NAME +"] " + message);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }
}
