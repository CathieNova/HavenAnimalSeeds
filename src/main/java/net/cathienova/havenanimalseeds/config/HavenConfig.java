package net.cathienova.havenanimalseeds.config;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.minecraftforge.fml.config.ModConfig;

public class HavenConfig
{
    public static int playerGrowthDistance;
    public static int axolotl_seed_spawn_timer;
    public static int bee_seed_spawn_timer;
    public static int cat_seed_spawn_timer;
    public static int chicken_seed_spawn_timer;
    public static int cow_seed_spawn_timer;
    public static int donkey_seed_spawn_timer;
    public static int fox_seed_spawn_timer;
    public static int goat_seed_spawn_timer;
    public static int horse_seed_spawn_timer;
    public static int llama_seed_spawn_timer;
    public static int mooshroom_seed_spawn_timer;
    public static int mule_seed_spawn_timer;
    public static int ocelot_seed_spawn_timer;
    public static int panda_seed_spawn_timer;
    public static int pig_seed_spawn_timer;
    public static int rabbit_seed_spawn_timer;
    public static int sheep_seed_spawn_timer;
    public static int sniffer_seed_spawn_timer;
    public static int parrot_seed_spawn_timer;
    public static int turtle_seed_spawn_timer;
    public static int wolf_seed_spawn_timer;
    public static int dolphin_seed_spawn_timer;
    public static int glow_squid_seed_spawn_timer;
    public static int polar_bear_seed_spawn_timer;
    public static int squid_seed_spawn_timer;
    public static int villager_seed_spawn_timer;

    public static void bake(ModConfig config)
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
    }
}
