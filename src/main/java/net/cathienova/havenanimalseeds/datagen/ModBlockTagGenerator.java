package net.cathienova.havenanimalseeds.datagen;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.cathienova.havenanimalseeds.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider
{
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, HavenAnimalSeeds.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        var animalSeeds = this.tag(ModTags.Blocks.animalSeeds);
        ModBlocks.getMobSeeds().forEach(seed -> animalSeeds.add(seed.get()));
    }

}