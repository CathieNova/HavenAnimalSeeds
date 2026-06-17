package net.cathienova.havenanimalseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.cathienova.havenanimalseeds.config.ClientConfig;
import net.cathienova.havenanimalseeds.config.CommonConfig;
import net.cathienova.havenanimalseeds.item.ModCreativeModTabs;
import net.cathienova.havenanimalseeds.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(HavenAnimalSeeds.MOD_ID)
public class HavenAnimalSeeds
{
    public static final String MOD_ID = "havenanimalseeds";
    public static final String MOD_NAME = "HavenAnimalSeeds";
    private static final Logger LOGGER = LoggerFactory.getLogger(HavenAnimalSeeds.class);
    static final ModConfigSpec commonSpec;
    static final ModConfigSpec clientSpec;
    public static final CommonConfig c_config;
    public static final ClientConfig client_config;

    static
    {
        final Pair<CommonConfig, ModConfigSpec> commonSpecPair = new ModConfigSpec.Builder().configure(CommonConfig::new);
        commonSpec = commonSpecPair.getRight();
        c_config = commonSpecPair.getLeft();

        final Pair<ClientConfig, ModConfigSpec> clientSpecPair = new ModConfigSpec.Builder().configure(ClientConfig::new);
        clientSpec = clientSpecPair.getRight();
        client_config = clientSpecPair.getLeft();
    }

    public HavenAnimalSeeds(IEventBus modEventBus, ModContainer modContainer)
    {
        modContainer.registerConfig(ModConfig.Type.COMMON, commonSpec);
        modContainer.registerConfig(ModConfig.Type.CLIENT, clientSpec);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);
    }

    public static void Log(String message)
    {
        LOGGER.info("[{}] {}", MOD_NAME, message);
    }
}