package net.cathienova.havenanimalseeds.datagen.recipes;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.cathienova.havenanimalseeds.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{
    public ModRecipeProvider(PackOutput pOutput)
    {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> output)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.axolotl_seed.get(), 1)
                .pattern("SSS")
                .pattern("SLS")
                .pattern("SSS")
                .define('S', Items.SEAGRASS)
                .define('L', Items.WATER_BUCKET)
                .unlockedBy("has_seagrass", has(Items.SEAGRASS))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/axolotl_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.bee_seed.get(), 1)
                .pattern("PDP")
                .pattern("DSD")
                .pattern("PDP")
                .define('P', Items.POPPY)
                .define('D', Items.DANDELION)
                .define('S', Items.WHEAT_SEEDS)
                .unlockedBy("has_poppy", has(Items.POPPY))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/bee_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.cat_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', ItemTags.FISHES)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_fish", has(ItemTags.FISHES))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/cat_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.chicken_seed.get(), 1)
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', Items.WHEAT_SEEDS)
                .unlockedBy("has_wheat_seeds", has(Items.WHEAT_SEEDS))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/chicken_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.cow_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.WHEAT)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/cow_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.donkey_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.GOLDEN_CARROT)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_golden_carrot", has(Items.GOLDEN_CARROT))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/donkey_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.fox_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.SWEET_BERRIES)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_sweet_berries", has(Items.SWEET_BERRIES))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/fox_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.goat_seed.get(), 1)
                .pattern("CSC")
                .pattern("SWS")
                .pattern("CSC")
                .define('S', Items.WHEAT)
                .define('C', Items.STONE)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/goat_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.horse_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.GOLDEN_APPLE)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_golden_apple", has(Items.GOLDEN_APPLE))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/horse_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.llama_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.HAY_BLOCK)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_hay_block", has(Items.HAY_BLOCK))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/llama_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.mooshroom_seed.get(), 1)
                .pattern("RBR")
                .pattern("BWB")
                .pattern("RBR")
                .define('R', Items.RED_MUSHROOM)
                .define('B', Items.BROWN_MUSHROOM)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_red_mushroom", has(Items.RED_MUSHROOM))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/mooshroom_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.mule_seed.get(), 1)
                .pattern("SSS")
                .pattern("GWG")
                .pattern("SSS")
                .define('S', Items.CARROT)
                .define('G', Items.GOLDEN_CARROT)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_golden_carrot", has(Items.GOLDEN_CARROT))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/mule_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ocelot_seed.get(), 1)
                .pattern("SBS")
                .pattern("SWS")
                .pattern("SBS")
                .define('S', Items.COD)
                .define('B', Items.BAMBOO)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_cod", has(Items.COD))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/ocelot_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.panda_seed.get(), 1)
                .pattern("BBB")
                .pattern("BWB")
                .pattern("BBB")
                .define('B', Items.BAMBOO)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_bamboo", has(Items.BAMBOO))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/panda_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.pig_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.CARROT)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_carrot", has(Items.CARROT))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/pig_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.rabbit_seed.get(), 1)
                .pattern("SSS")
                .pattern("BWB")
                .pattern("SSS")
                .define('S', Items.CARROT)
                .define('B', Items.SAND)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_carrot", has(Items.CARROT))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/rabbit_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.sheep_seed.get(), 1)
                .pattern("TTT")
                .pattern("WHW")
                .pattern("WWW")
                .define('T', Items.STRING)
                .define('H', Items.WHEAT_SEEDS)
                .define('W', Items.WHEAT)
                .unlockedBy("has_string", has(Items.STRING))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/sheep_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.sniffer_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.BONE_MEAL)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_bone_meal", has(Items.BONE_MEAL))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/sniffer_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.parrot_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.COOKIE)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_cookie", has(Items.COOKIE))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/parrot_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.turtle_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.SEAGRASS)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_seagrass", has(Items.SEAGRASS))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/turtle_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.wolf_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.BONE)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_bone", has(Items.BONE))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/wolf_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.dolphin_seed.get(), 1)
                .pattern("SSS")
                .pattern("FWF")
                .pattern("SSS")
                .define('S', Items.SEAGRASS)
                .define('F', ItemTags.FISHES)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_seagrass", has(Items.SEAGRASS))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/dolphin_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.glow_squid_seed.get(), 1)
                .pattern("DDD")
                .pattern("GSG")
                .pattern("DDD")
                .define('D', ModTags.Items.dyes)
                .define('G', Items.GLOWSTONE_DUST)
                .define('S', Items.WHEAT_SEEDS)
                .unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/glow_squid_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.polar_bear_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.SALMON)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_salmon", has(Items.SALMON))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/polar_bear_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.squid_seed.get(), 1)
                .pattern("DDD")
                .pattern("DSD")
                .pattern("DDD")
                .define('D', Items.BLACK_DYE)
                .define('S', Items.WHEAT_SEEDS)
                .unlockedBy("has_black_dye", has(Items.BLACK_DYE))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/squid_seed");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.villager_seed.get(), 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.EMERALD)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_emerald", has(Items.EMERALD))
                .save(output, HavenAnimalSeeds.MOD_ID + ":craft/villager_seed");
    }
}
