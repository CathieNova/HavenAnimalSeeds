package net.cathienova.havenanimalseeds.datagen;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.cathienova.havenanimalseeds.block.ModBlocks;
import net.cathienova.havenanimalseeds.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                               CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, HavenAnimalSeeds.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider)
    {
        this.tag(ModTags.Items.animalSeeds)
                .add(ModBlocks.axolotl_seed.get().asItem())
                .add(ModBlocks.bee_seed.get().asItem())
                .add(ModBlocks.cat_seed.get().asItem())
                .add(ModBlocks.chicken_seed.get().asItem())
                .add(ModBlocks.cow_seed.get().asItem())
                .add(ModBlocks.donkey_seed.get().asItem())
                .add(ModBlocks.fox_seed.get().asItem())
                .add(ModBlocks.goat_seed.get().asItem())
                .add(ModBlocks.horse_seed.get().asItem())
                .add(ModBlocks.llama_seed.get().asItem())
                .add(ModBlocks.mooshroom_seed.get().asItem())
                .add(ModBlocks.mule_seed.get().asItem())
                .add(ModBlocks.ocelot_seed.get().asItem())
                .add(ModBlocks.panda_seed.get().asItem())
                .add(ModBlocks.pig_seed.get().asItem())
                .add(ModBlocks.rabbit_seed.get().asItem())
                .add(ModBlocks.sheep_seed.get().asItem())
                .add(ModBlocks.sniffer_seed.get().asItem())
                .add(ModBlocks.parrot_seed.get().asItem())
                .add(ModBlocks.turtle_seed.get().asItem())
                .add(ModBlocks.wolf_seed.get().asItem())
                .add(ModBlocks.dolphin_seed.get().asItem())
                .add(ModBlocks.glow_squid_seed.get().asItem())
                .add(ModBlocks.polar_bear_seed.get().asItem())
                .add(ModBlocks.squid_seed.get().asItem())
                .add(ModBlocks.villager_seed.get().asItem())
                ;
    }
}
