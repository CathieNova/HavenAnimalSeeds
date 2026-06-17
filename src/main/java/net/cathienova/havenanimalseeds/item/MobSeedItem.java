package net.cathienova.havenanimalseeds.item;

import net.cathienova.havenanimalseeds.block.mobseeds.MobSeedBlock;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.List;

public class MobSeedItem extends BlockItem
{
    private final List<Component> placementTooltips;

    public MobSeedItem(Block block, Properties properties)
    {
        super(block, properties);
        MobSeedBlock seedBlock = (MobSeedBlock) block;
        List<Component> tooltips = new ArrayList<>(2);

        if (seedBlock.canGrowOnBlocks())
        {
            tooltips.add(createBlockPlacementTooltip(seedBlock.getPlacementBlocks()));
        }
        if (seedBlock.canGrowInWater())
        {
            tooltips.add(Component.translatable("block.havenanimalseeds.placement_in", Blocks.WATER.getName()).withStyle(ChatFormatting.DARK_GREEN));
        }

        placementTooltips = List.copyOf(tooltips);
    }

    private Component createBlockPlacementTooltip(List<Block> placementBlocks)
    {
        MutableComponent blockNames = Component.empty();
        for (int index = 0; index < placementBlocks.size(); index++)
        {
            if (index > 0)
            {
                blockNames.append(", ");
            }
            blockNames.append(placementBlocks.get(index).getName());
        }
        return Component.translatable("block.havenanimalseeds.placement_on", blockNames).withStyle(ChatFormatting.DARK_GREEN);
    }

    public List<Component> getPlacementTooltips()
    {
        return placementTooltips;
    }
}