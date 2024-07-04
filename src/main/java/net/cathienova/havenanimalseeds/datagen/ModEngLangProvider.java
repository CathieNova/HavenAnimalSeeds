package net.cathienova.havenanimalseeds.datagen;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.cathienova.havenanimalseeds.item.ModCreativeModTabs;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEngLangProvider extends LanguageProvider
{
    public ModEngLangProvider(PackOutput output)
    {
        super(output, HavenAnimalSeeds.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations()
    {
        add(ModCreativeModTabs.HavenAnimalSeeds_tab_title, "§5Haven §2Animal Seeds");
        add(ModBlocks.axolotl_seed.get(), "Axolotl Seed");
        add(ModBlocks.bee_seed.get(), "Bee Seed");
        add(ModBlocks.cat_seed.get(), "Cat Seed");
        add(ModBlocks.chicken_seed.get(), "Chicken Seed");
        add(ModBlocks.cow_seed.get(), "Cow Seed");
        add(ModBlocks.donkey_seed.get(), "Donkey Seed");
        add(ModBlocks.fox_seed.get(), "Fox Seed");
        add(ModBlocks.goat_seed.get(), "Goat Seed");
        add(ModBlocks.horse_seed.get(), "Horse Seed");
        add(ModBlocks.llama_seed.get(), "Llama Seed");
        add(ModBlocks.mooshroom_seed.get(), "Mooshroom Seed");
        add(ModBlocks.mule_seed.get(), "Mule Seed");
        add(ModBlocks.ocelot_seed.get(), "Ocelot Seed");
        add(ModBlocks.panda_seed.get(), "Panda Seed");
        add(ModBlocks.pig_seed.get(), "Pig Seed");
        add(ModBlocks.rabbit_seed.get(), "Rabbit Seed");
        add(ModBlocks.sheep_seed.get(), "Sheep Seed");
        add(ModBlocks.sniffer_seed.get(), "Sniffer Seed");
        add(ModBlocks.parrot_seed.get(), "Parrot Seed");
        add(ModBlocks.turtle_seed.get(), "Turtle Seed");
        add(ModBlocks.wolf_seed.get(), "Wolf Seed");
        add(ModBlocks.dolphin_seed.get(), "Dolphin Seed");
        add(ModBlocks.glow_squid_seed.get(), "Glow Squid Seed");
        add(ModBlocks.polar_bear_seed.get(), "Polar Bear Seed");
        add(ModBlocks.squid_seed.get(), "Squid Seed");
        add(ModBlocks.villager_seed.get(), "Village Seed");

        add("mobseed.remaining_time", "Growing time: %d seconds");
        add("mobseed.tooclose", "§cYou're too close to the seed for it to grow.");
        add("config.jade.plugin_havenanimalseeds.mobseed_remaining_time", "Remaining Time");

        add("block.havenanimalseeds.placement_on", "§7Can only be placed on %s");
        add("block.havenanimalseeds.placement_in", "§7Can only be placed in %s");
    }
}
