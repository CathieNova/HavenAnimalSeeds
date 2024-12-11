package net.cathienova.havenanimalseeds.config;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = "havenanimalseeds", bus = EventBusSubscriber.Bus.MOD)
public class CommonConfig {

    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.IntValue playerGrowthDistance = BUILDER
            .comment("The distance in blocks a player has to be from a mob seed for it to grow. (if 3 then it checks 3x3x3)")
            .defineInRange("playerGrowthDistance", 10, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue axolotlSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for an axolotl to spawn from an axolotl seed.")
            .defineInRange("axolotlSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue beeSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a bee to spawn from a bee seed.")
            .defineInRange("beeSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue catSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a cat to spawn from a cat seed.")
            .defineInRange("catSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue chickenSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a chicken to spawn from a chicken seed.")
            .defineInRange("chickenSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue cowSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a cow to spawn from a cow seed.")
            .defineInRange("cowSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue donkeySeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a donkey to spawn from a donkey seed.")
            .defineInRange("donkeySeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue foxSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a fox to spawn from a fox seed.")
            .defineInRange("foxSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue goatSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a goat to spawn from a goat seed.")
            .defineInRange("goatSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue horseSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a horse to spawn from a horse seed.")
            .defineInRange("horseSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue llamaSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a llama to spawn from a llama seed.")
            .defineInRange("llamaSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue mooshroomSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a mooshroom to spawn from a mooshroom seed.")
            .defineInRange("mooshroomSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue muleSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a mule to spawn from a mule seed.")
            .defineInRange("muleSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue ocelotSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for an ocelot to spawn from an ocelot seed.")
            .defineInRange("ocelotSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue pandaSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a panda to spawn from a panda seed.")
            .defineInRange("pandaSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue pigSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a pig to spawn from a pig seed.")
            .defineInRange("pigSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue rabbitSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a rabbit to spawn from a rabbit seed.")
            .defineInRange("rabbitSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue sheepSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a sheep to spawn from a sheep seed.")
            .defineInRange("sheepSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue snifferSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a sniffer to spawn from a sniffer seed.")
            .defineInRange("snifferSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue parrotSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a parrot to spawn from a parrot seed.")
            .defineInRange("parrotSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue turtleSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a turtle to spawn from a turtle seed.")
            .defineInRange("turtleSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue wolfSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a wolf to spawn from a wolf seed.")
            .defineInRange("wolfSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue dolphinSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a dolphin to spawn from a dolphin seed.")
            .defineInRange("dolphinSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue glowSquidSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a glow squid to spawn from a glow squid seed.")
            .defineInRange("glowSquidSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue polarBearSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a polar bear to spawn from a polar bear seed.")
            .defineInRange("polarBearSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue squidSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a squid to spawn from a squid seed.")
            .defineInRange("squidSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue villagerSeedSpawnTimer = BUILDER
            .comment("The time it takes in ticks for a villager to spawn from a villager seed.")
            .defineInRange("villagerSeedSpawnTimer", 12000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec SPEC = BUILDER.build();

    @SubscribeEvent
    static void onLoad(ModConfigEvent event) {
        if (event.getConfig().getSpec() == SPEC) {
            playerGrowthDistance.get();
            axolotlSeedSpawnTimer.get();
            beeSeedSpawnTimer.get();
            catSeedSpawnTimer.get();
            chickenSeedSpawnTimer.get();
            cowSeedSpawnTimer.get();
            donkeySeedSpawnTimer.get();
            foxSeedSpawnTimer.get();
            goatSeedSpawnTimer.get();
            horseSeedSpawnTimer.get();
            llamaSeedSpawnTimer.get();
            mooshroomSeedSpawnTimer.get();
            muleSeedSpawnTimer.get();
            ocelotSeedSpawnTimer.get();
            pandaSeedSpawnTimer.get();
            pigSeedSpawnTimer.get();
            rabbitSeedSpawnTimer.get();
            sheepSeedSpawnTimer.get();
            snifferSeedSpawnTimer.get();
            parrotSeedSpawnTimer.get();
            turtleSeedSpawnTimer.get();
            wolfSeedSpawnTimer.get();
            dolphinSeedSpawnTimer.get();
            glowSquidSeedSpawnTimer.get();
            polarBearSeedSpawnTimer.get();
            squidSeedSpawnTimer.get();
            villagerSeedSpawnTimer.get();
        }
    }

}
