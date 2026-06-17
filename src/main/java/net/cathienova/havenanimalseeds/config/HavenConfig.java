package net.cathienova.havenanimalseeds.config;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.neoforged.fml.config.ModConfig;

public class HavenConfig
{
    public static volatile int playerGrowthDistance;
    public static volatile int axolotl_seed_spawn_timer;
    public static volatile int bee_seed_spawn_timer;
    public static volatile int cat_seed_spawn_timer;
    public static volatile int chicken_seed_spawn_timer;
    public static volatile int cow_seed_spawn_timer;
    public static volatile int donkey_seed_spawn_timer;
    public static volatile int fox_seed_spawn_timer;
    public static volatile int goat_seed_spawn_timer;
    public static volatile int horse_seed_spawn_timer;
    public static volatile int llama_seed_spawn_timer;
    public static volatile int mooshroom_seed_spawn_timer;
    public static volatile int mule_seed_spawn_timer;
    public static volatile int ocelot_seed_spawn_timer;
    public static volatile int panda_seed_spawn_timer;
    public static volatile int pig_seed_spawn_timer;
    public static volatile int rabbit_seed_spawn_timer;
    public static volatile int sheep_seed_spawn_timer;
    public static volatile int sniffer_seed_spawn_timer;
    public static volatile int parrot_seed_spawn_timer;
    public static volatile int turtle_seed_spawn_timer;
    public static volatile int wolf_seed_spawn_timer;
    public static volatile int dolphin_seed_spawn_timer;
    public static volatile int glow_squid_seed_spawn_timer;
    public static volatile int polar_bear_seed_spawn_timer;
    public static volatile int squid_seed_spawn_timer;
    public static volatile int villager_seed_spawn_timer;
    public static volatile int allay_seed_spawn_timer;
    public static volatile int armadillo_seed_spawn_timer;
    public static volatile int camel_seed_spawn_timer;
    public static volatile int nautilus_seed_spawn_timer;
    public static volatile int seed_model_render_distance = 48;

    public static void bake(ModConfig config)
    {
        if (!HavenAnimalSeeds.MOD_ID.equals(config.getModId()))
        {
            return;
        }

        if (config.getType() == ModConfig.Type.COMMON)
        {
            playerGrowthDistance = HavenAnimalSeeds.c_config.playerGrowthDistance.get();
            axolotl_seed_spawn_timer = HavenAnimalSeeds.c_config.axolotl_seed_spawn_timer.get();
            bee_seed_spawn_timer = HavenAnimalSeeds.c_config.bee_seed_spawn_timer.get();
            cat_seed_spawn_timer = HavenAnimalSeeds.c_config.cat_seed_spawn_timer.get();
            chicken_seed_spawn_timer = HavenAnimalSeeds.c_config.chicken_seed_spawn_timer.get();
            cow_seed_spawn_timer = HavenAnimalSeeds.c_config.cow_seed_spawn_timer.get();
            donkey_seed_spawn_timer = HavenAnimalSeeds.c_config.donkey_seed_spawn_timer.get();
            fox_seed_spawn_timer = HavenAnimalSeeds.c_config.fox_seed_spawn_timer.get();
            goat_seed_spawn_timer = HavenAnimalSeeds.c_config.goat_seed_spawn_timer.get();
            horse_seed_spawn_timer = HavenAnimalSeeds.c_config.horse_seed_spawn_timer.get();
            llama_seed_spawn_timer = HavenAnimalSeeds.c_config.llama_seed_spawn_timer.get();
            mooshroom_seed_spawn_timer = HavenAnimalSeeds.c_config.mooshroom_seed_spawn_timer.get();
            mule_seed_spawn_timer = HavenAnimalSeeds.c_config.mule_seed_spawn_timer.get();
            ocelot_seed_spawn_timer = HavenAnimalSeeds.c_config.ocelot_seed_spawn_timer.get();
            panda_seed_spawn_timer = HavenAnimalSeeds.c_config.panda_seed_spawn_timer.get();
            pig_seed_spawn_timer = HavenAnimalSeeds.c_config.pig_seed_spawn_timer.get();
            rabbit_seed_spawn_timer = HavenAnimalSeeds.c_config.rabbit_seed_spawn_timer.get();
            sheep_seed_spawn_timer = HavenAnimalSeeds.c_config.sheep_seed_spawn_timer.get();
            sniffer_seed_spawn_timer = HavenAnimalSeeds.c_config.sniffer_seed_spawn_timer.get();
            parrot_seed_spawn_timer = HavenAnimalSeeds.c_config.parrot_seed_spawn_timer.get();
            turtle_seed_spawn_timer = HavenAnimalSeeds.c_config.turtle_seed_spawn_timer.get();
            wolf_seed_spawn_timer = HavenAnimalSeeds.c_config.wolf_seed_spawn_timer.get();
            dolphin_seed_spawn_timer = HavenAnimalSeeds.c_config.dolphin_seed_spawn_timer.get();
            glow_squid_seed_spawn_timer = HavenAnimalSeeds.c_config.glow_squid_seed_spawn_timer.get();
            polar_bear_seed_spawn_timer = HavenAnimalSeeds.c_config.polar_bear_seed_spawn_timer.get();
            squid_seed_spawn_timer = HavenAnimalSeeds.c_config.squid_seed_spawn_timer.get();
            villager_seed_spawn_timer = HavenAnimalSeeds.c_config.villager_seed_spawn_timer.get();
            allay_seed_spawn_timer = HavenAnimalSeeds.c_config.allay_seed_spawn_timer.get();
            armadillo_seed_spawn_timer = HavenAnimalSeeds.c_config.armadillo_seed_spawn_timer.get();
            camel_seed_spawn_timer = HavenAnimalSeeds.c_config.camel_seed_spawn_timer.get();
            nautilus_seed_spawn_timer = HavenAnimalSeeds.c_config.nautilus_seed_spawn_timer.get();
        }
        else if (config.getType() == ModConfig.Type.CLIENT)
        {
            seed_model_render_distance = HavenAnimalSeeds.client_config.seedModelRenderDistance.get();
        }
    }
}