package net.cathienova.havenanimalseeds.util;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static class Blocks
    {
        public static final TagKey<Block> animalSeeds = tag("animal_seeds");

        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(Identifier.fromNamespaceAndPath(HavenAnimalSeeds.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> animalSeeds = tag("animal_seeds");
        public static final TagKey<Item> dyes = tag("dyes");

        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(Identifier.fromNamespaceAndPath(HavenAnimalSeeds.MOD_ID, name));
        }
    }
}