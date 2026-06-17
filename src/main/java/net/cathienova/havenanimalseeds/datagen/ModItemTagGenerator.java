package net.cathienova.havenanimalseeds.datagen;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.cathienova.havenanimalseeds.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, HavenAnimalSeeds.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        var animalSeeds = this.tag(ModTags.Items.animalSeeds);
        ModBlocks.getMobSeeds().forEach(seed -> animalSeeds.add(seed.get().asItem()));

        this.tag(ModTags.Items.dyes)
                .add(Items.WHITE_DYE)
                .add(Items.ORANGE_DYE)
                .add(Items.MAGENTA_DYE)
                .add(Items.LIGHT_BLUE_DYE)
                .add(Items.YELLOW_DYE)
                .add(Items.LIME_DYE)
                .add(Items.PINK_DYE)
                .add(Items.GRAY_DYE)
                .add(Items.LIGHT_GRAY_DYE)
                .add(Items.CYAN_DYE)
                .add(Items.PURPLE_DYE)
                .add(Items.BLUE_DYE)
                .add(Items.BROWN_DYE)
                .add(Items.GREEN_DYE)
                .add(Items.RED_DYE)
                .add(Items.BLACK_DYE);
    }
}