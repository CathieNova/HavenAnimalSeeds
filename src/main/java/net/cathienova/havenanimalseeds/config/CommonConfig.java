package net.cathienova.havenanimalseeds.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
    public final ForgeConfigSpec.IntValue playerGrowthDistance;
    public final ForgeConfigSpec.IntValue axolotl_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue bee_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue cat_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue chicken_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue cow_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue donkey_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue fox_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue goat_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue horse_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue llama_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue mooshroom_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue mule_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue ocelot_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue panda_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue pig_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue rabbit_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue sheep_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue sniffer_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue parrot_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue turtle_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue wolf_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue dolphin_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue glow_squid_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue polar_bear_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue squid_seed_spawn_timer;
    public final ForgeConfigSpec.IntValue villager_seed_spawn_timer;

    public CommonConfig(ForgeConfigSpec.Builder builder) {
        builder.comment("Mob Seeds").push("mobSeeds").build();
        playerGrowthDistance = builder.comment("The distance in blocks a player has to be from a mob seed for it to grow. (if 3 then it checks 3x3x3)").defineInRange("playerGrowthDistance", 10, 1, Integer.MAX_VALUE);
        axolotl_seed_spawn_timer = builder.comment("The time it takes in ticks for an axolotl to spawn from an axolotl seed. (20 ticks = 1 second)").defineInRange("axolotl_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        bee_seed_spawn_timer = builder.comment("The time it takes in ticks for a bee to spawn from a bee seed. (20 ticks = 1 second)").defineInRange("bee_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        cat_seed_spawn_timer = builder.comment("The time it takes in ticks for a cat to spawn from a cat seed. (20 ticks = 1 second)").defineInRange("cat_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        chicken_seed_spawn_timer = builder.comment("The time in ticks it takes for a chicken to spawn from a chicken seed. (20 ticks = 1 second)").defineInRange("chicken_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        cow_seed_spawn_timer = builder.comment("The time in ticks it takes for a cow to spawn from a cow seed. (20 ticks = 1 second)").defineInRange("cow_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        donkey_seed_spawn_timer = builder.comment("The time in ticks it takes for a donkey to spawn from a donkey seed. (20 ticks = 1 second)").defineInRange("donkey_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        fox_seed_spawn_timer = builder.comment("The time in ticks it takes for a fox to spawn from a fox seed. (20 ticks = 1 second)").defineInRange("fox_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        goat_seed_spawn_timer = builder.comment("The time in ticks it takes for a goat to spawn from a goat seed. (20 ticks = 1 second)").defineInRange("goat_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        horse_seed_spawn_timer = builder.comment("The time in ticks it takes for a horse to spawn from a horse seed. (20 ticks = 1 second)").defineInRange("horse_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        llama_seed_spawn_timer = builder.comment("The time in ticks it takes for a llama to spawn from a llama seed. (20 ticks = 1 second)").defineInRange("llama_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        mooshroom_seed_spawn_timer = builder.comment("The time in ticks it takes for a mooshroom to spawn from a mooshroom seed. (20 ticks = 1 second)").defineInRange("mooshroom_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        mule_seed_spawn_timer = builder.comment("The time in ticks it takes for a mule to spawn from a mule seed. (20 ticks = 1 second)").defineInRange("mule_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        ocelot_seed_spawn_timer = builder.comment("The time in ticks it takes for an ocelot to spawn from an ocelot seed. (20 ticks = 1 second)").defineInRange("ocelot_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        panda_seed_spawn_timer = builder.comment("The time in ticks it takes for a panda to spawn from a panda seed. (20 ticks = 1 second)").defineInRange("panda_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        pig_seed_spawn_timer = builder.comment("The time in ticks it takes for a pig to spawn from a pig seed. (20 ticks = 1 second)").defineInRange("pig_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        rabbit_seed_spawn_timer = builder.comment("The time in ticks it takes for a rabbit to spawn from a rabbit seed. (20 ticks = 1 second)").defineInRange("rabbit_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        sheep_seed_spawn_timer = builder.comment("The time in ticks it takes for a sheep to spawn from a sheep seed. (20 ticks = 1 second)").defineInRange("sheep_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        sniffer_seed_spawn_timer = builder.comment("The time in ticks it takes for a sniffer to spawn from a sniffer seed. (20 ticks = 1 second)").defineInRange("sniffer_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        parrot_seed_spawn_timer = builder.comment("The time in ticks it takes for a parrot to spawn from a parrot seed. (20 ticks = 1 second)").defineInRange("parrot_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        turtle_seed_spawn_timer = builder.comment("The time in ticks it takes for a turtle to spawn from a turtle seed. (20 ticks = 1 second)").defineInRange("turtle_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        wolf_seed_spawn_timer = builder.comment("The time in ticks it takes for a wolf to spawn from a wolf seed. (20 ticks = 1 second)").defineInRange("wolf_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        dolphin_seed_spawn_timer = builder.comment("The time in ticks it takes for a dolphin to spawn from a dolphin seed. (20 ticks = 1 second)").defineInRange("dolphin_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        glow_squid_seed_spawn_timer = builder.comment("The time in ticks it takes for a glow squid to spawn from a glow squid seed. (20 ticks = 1 second)").defineInRange("glow_squid_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        polar_bear_seed_spawn_timer = builder.comment("The time in ticks it takes for a polar bear to spawn from a polar bear seed. (20 ticks = 1 second)").defineInRange("polar_bear_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        squid_seed_spawn_timer = builder.comment("The time in ticks it takes for a squid to spawn from a squid seed. (20 ticks = 1 second)").defineInRange("squid_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        villager_seed_spawn_timer = builder.comment("The time in ticks it takes for a villager to spawn from a villager seed. (20 ticks = 1 second)").defineInRange("villager_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        builder.pop();
    }
}
