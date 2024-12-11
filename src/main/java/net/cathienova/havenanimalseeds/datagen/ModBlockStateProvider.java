package net.cathienova.havenanimalseeds.datagen;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HavenAnimalSeeds.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        crossBlock(ModBlocks.axolotl_seed);
        crossBlock(ModBlocks.bee_seed);
        crossBlock(ModBlocks.cat_seed);
        crossBlock(ModBlocks.chicken_seed);
        crossBlock(ModBlocks.cow_seed);
        crossBlock(ModBlocks.donkey_seed);
        crossBlock(ModBlocks.fox_seed);
        crossBlock(ModBlocks.goat_seed);
        crossBlock(ModBlocks.horse_seed);
        crossBlock(ModBlocks.llama_seed);
        crossBlock(ModBlocks.mooshroom_seed);
        crossBlock(ModBlocks.mule_seed);
        crossBlock(ModBlocks.ocelot_seed);
        crossBlock(ModBlocks.panda_seed);
        crossBlock(ModBlocks.parrot_seed);
        crossBlock(ModBlocks.pig_seed);
        crossBlock(ModBlocks.rabbit_seed);
        crossBlock(ModBlocks.sheep_seed);
        crossBlock(ModBlocks.sniffer_seed);
        crossBlock(ModBlocks.turtle_seed);
        crossBlock(ModBlocks.wolf_seed);
        crossBlock(ModBlocks.dolphin_seed);
        crossBlock(ModBlocks.glow_squid_seed);
        crossBlock(ModBlocks.polar_bear_seed);
        crossBlock(ModBlocks.squid_seed);
        crossBlock(ModBlocks.villager_seed);
    }

    private void blockItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(HavenAnimalSeeds.MOD_ID +
                ":block/" + BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void crossBlock(DeferredBlock<Block> blockRegistryObject) {
        ModelFile blockModel = models().cross(blockRegistryObject.getId().getPath(), ResourceLocation.fromNamespaceAndPath(HavenAnimalSeeds.MOD_ID, "block/animalgrass"));
        simpleBlock(blockRegistryObject.get(), blockModel);

        itemModels().withExistingParent(blockRegistryObject.getId().getPath(), "item/generated")
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(HavenAnimalSeeds.MOD_ID, "item/" + blockRegistryObject.getId().getPath()));
    }
}
