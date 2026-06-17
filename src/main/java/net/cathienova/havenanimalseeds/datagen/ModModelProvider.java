package net.cathienova.havenanimalseeds.datagen;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

public class ModModelProvider extends ModelProvider
{
    public ModModelProvider(PackOutput output)
    {
        super(output, HavenAnimalSeeds.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels)
    {
        ModBlocks.getMobSeeds().forEach(seed -> crossBlock(blockModels, itemModels, seed.get()));
    }

    private void crossBlock(BlockModelGenerators blockModels, ItemModelGenerators itemModels, Block block)
    {
        Identifier model = ModelTemplates.CROSS.create(
                block,
                TextureMapping.cross(new Material(Identifier.fromNamespaceAndPath(HavenAnimalSeeds.MOD_ID, "block/animalgrass"))),
                blockModels.modelOutput
        );
        blockModels.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, BlockModelGenerators.plainVariant(model)));
        itemModels.generateFlatItem(block.asItem(), ModelTemplates.FLAT_ITEM.extend().build());
    }
}