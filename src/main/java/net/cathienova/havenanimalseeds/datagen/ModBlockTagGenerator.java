package net.cathienova.havenanimalseeds.datagen;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.cathienova.havenanimalseeds.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, HavenAnimalSeeds.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        this.tag(ModTags.Blocks.animalSeeds)
                .add(ModBlocks.axolotl_seed.get())
                .add(ModBlocks.bee_seed.get())
                .add(ModBlocks.cat_seed.get())
                .add(ModBlocks.chicken_seed.get())
                .add(ModBlocks.cow_seed.get())
                .add(ModBlocks.donkey_seed.get())
                .add(ModBlocks.fox_seed.get())
                .add(ModBlocks.goat_seed.get())
                .add(ModBlocks.horse_seed.get())
                .add(ModBlocks.llama_seed.get())
                .add(ModBlocks.mooshroom_seed.get())
                .add(ModBlocks.mule_seed.get())
                .add(ModBlocks.ocelot_seed.get())
                .add(ModBlocks.panda_seed.get())
                .add(ModBlocks.pig_seed.get())
                .add(ModBlocks.rabbit_seed.get())
                .add(ModBlocks.sheep_seed.get())
                .add(ModBlocks.sniffer_seed.get())
                .add(ModBlocks.parrot_seed.get())
                .add(ModBlocks.turtle_seed.get())
                .add(ModBlocks.wolf_seed.get())
                .add(ModBlocks.dolphin_seed.get())
                .add(ModBlocks.glow_squid_seed.get())
                .add(ModBlocks.polar_bear_seed.get())
                .add(ModBlocks.squid_seed.get())
                .add(ModBlocks.villager_seed.get())
        ;
    }
}