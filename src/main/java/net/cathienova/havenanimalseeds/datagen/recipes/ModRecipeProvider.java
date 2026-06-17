package net.cathienova.havenanimalseeds.datagen.recipes;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.cathienova.havenanimalseeds.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider
{
    protected ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes()
    {
        this.shaped(RecipeCategory.MISC, ModBlocks.axolotl_seed.get())
                .pattern("SSS")
                .pattern("SLS")
                .pattern("SSS")
                .define('S', Items.SEAGRASS)
                .define('L', Items.WATER_BUCKET)
                .unlockedBy("has_seagrass", has(Items.SEAGRASS))
                .save(output, recipe("craft/axolotl_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.bee_seed.get())
                .pattern("PDP")
                .pattern("DSD")
                .pattern("PDP")
                .define('P', Items.POPPY)
                .define('D', Items.DANDELION)
                .define('S', Items.WHEAT_SEEDS)
                .unlockedBy("has_poppy", has(Items.POPPY))
                .save(output, recipe("craft/bee_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.cat_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', ItemTags.FISHES)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_fish", has(ItemTags.FISHES))
                .save(output, recipe("craft/cat_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.chicken_seed.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', Items.WHEAT_SEEDS)
                .unlockedBy("has_wheat_seeds", has(Items.WHEAT_SEEDS))
                .save(output, recipe("craft/chicken_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.cow_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.WHEAT)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .save(output, recipe("craft/cow_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.donkey_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.GOLDEN_CARROT)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_golden_carrot", has(Items.GOLDEN_CARROT))
                .save(output, recipe("craft/donkey_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.fox_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.SWEET_BERRIES)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_sweet_berries", has(Items.SWEET_BERRIES))
                .save(output, recipe("craft/fox_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.goat_seed.get())
                .pattern("CSC")
                .pattern("SWS")
                .pattern("CSC")
                .define('S', Items.WHEAT)
                .define('C', Items.STONE)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .save(output, recipe("craft/goat_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.horse_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.GOLDEN_APPLE)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_golden_apple", has(Items.GOLDEN_APPLE))
                .save(output, recipe("craft/horse_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.llama_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.HAY_BLOCK)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_hay_block", has(Items.HAY_BLOCK))
                .save(output, recipe("craft/llama_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.mooshroom_seed.get())
                .pattern("RBR")
                .pattern("BWB")
                .pattern("RBR")
                .define('R', Items.RED_MUSHROOM)
                .define('B', Items.BROWN_MUSHROOM)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_red_mushroom", has(Items.RED_MUSHROOM))
                .save(output, recipe("craft/mooshroom_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.mule_seed.get())
                .pattern("SSS")
                .pattern("GWG")
                .pattern("SSS")
                .define('S', Items.CARROT)
                .define('G', Items.GOLDEN_CARROT)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_golden_carrot", has(Items.GOLDEN_CARROT))
                .save(output, recipe("craft/mule_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.ocelot_seed.get())
                .pattern("SBS")
                .pattern("SWS")
                .pattern("SBS")
                .define('S', Items.COD)
                .define('B', Items.BAMBOO)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_cod", has(Items.COD))
                .save(output, recipe("craft/ocelot_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.panda_seed.get())
                .pattern("BBB")
                .pattern("BWB")
                .pattern("BBB")
                .define('B', Items.BAMBOO)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_bamboo", has(Items.BAMBOO))
                .save(output, recipe("craft/panda_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.pig_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.CARROT)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_carrot", has(Items.CARROT))
                .save(output, recipe("craft/pig_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.rabbit_seed.get())
                .pattern("SSS")
                .pattern("BWB")
                .pattern("SSS")
                .define('S', Items.CARROT)
                .define('B', Items.SAND)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_carrot", has(Items.CARROT))
                .save(output, recipe("craft/rabbit_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.sheep_seed.get())
                .pattern("TTT")
                .pattern("WHW")
                .pattern("WWW")
                .define('T', Items.STRING)
                .define('H', Items.WHEAT_SEEDS)
                .define('W', Items.WHEAT)
                .unlockedBy("has_string", has(Items.STRING))
                .save(output, recipe("craft/sheep_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.sniffer_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.BONE_MEAL)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_bone_meal", has(Items.BONE_MEAL))
                .save(output, recipe("craft/sniffer_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.parrot_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.COOKIE)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_cookie", has(Items.COOKIE))
                .save(output, recipe("craft/parrot_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.turtle_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.SEAGRASS)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_seagrass", has(Items.SEAGRASS))
                .save(output, recipe("craft/turtle_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.wolf_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.BONE)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_bone", has(Items.BONE))
                .save(output, recipe("craft/wolf_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.dolphin_seed.get())
                .pattern("SSS")
                .pattern("FWF")
                .pattern("SSS")
                .define('S', Items.SEAGRASS)
                .define('F', ItemTags.FISHES)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_seagrass", has(Items.SEAGRASS))
                .save(output, recipe("craft/dolphin_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.glow_squid_seed.get())
                .pattern("DDD")
                .pattern("GSG")
                .pattern("DDD")
                .define('D', ModTags.Items.dyes)
                .define('G', Items.GLOWSTONE_DUST)
                .define('S', Items.WHEAT_SEEDS)
                .unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST))
                .save(output, recipe("craft/glow_squid_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.polar_bear_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.SALMON)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_salmon", has(Items.SALMON))
                .save(output, recipe("craft/polar_bear_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.squid_seed.get())
                .pattern("DDD")
                .pattern("DSD")
                .pattern("DDD")
                .define('D', Items.BLACK_DYE)
                .define('S', Items.WHEAT_SEEDS)
                .unlockedBy("has_black_dye", has(Items.BLACK_DYE))
                .save(output, recipe("craft/squid_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.villager_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.EMERALD)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_emerald", has(Items.EMERALD))
                .save(output, recipe("craft/villager_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.allay_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.AMETHYST_SHARD)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_amethyst_shard", has(Items.AMETHYST_SHARD))
                .save(output, recipe("craft/allay_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.armadillo_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.SPIDER_EYE)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_spider_eye", has(Items.SPIDER_EYE))
                .save(output, recipe("craft/armadillo_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.camel_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.CACTUS)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_cactus", has(Items.CACTUS))
                .save(output, recipe("craft/camel_seed"));

        this.shaped(RecipeCategory.MISC, ModBlocks.nautilus_seed.get())
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Items.NAUTILUS_SHELL)
                .define('W', Items.WHEAT_SEEDS)
                .unlockedBy("has_nautilus_shell", has(Items.NAUTILUS_SHELL))
                .save(output, recipe("craft/nautilus_seed"));
    }

    private static ResourceKey<Recipe<?>> recipe(String path) {
        return ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(HavenAnimalSeeds.MOD_ID, path));
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider lookupProvider, RecipeOutput output) {
            return new ModRecipeProvider(lookupProvider, output);
        }

        @Override
        public String getName() {
            return "Haven Animal Seeds Recipes";
        }
    }
}