package net.cathienova.havenanimalseeds.compat.jade;

import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;
import snownee.jade.api.ui.Element;
import snownee.jade.api.ui.JadeUI;

public enum MobSeedComponentProvider implements IBlockComponentProvider
{
    INSTANCE;

    @Override
    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config)
    {
        if (!accessor.getServerData().contains("RemainingTime"))
        {
            return;
        }

        Element icon = JadeUI.item(new ItemStack(Items.CLOCK), 0.5F).size(10, 10).offset(0, -1);
        tooltip.add(icon);
        int remainingTime = accessor.getServerData().getIntOr("RemainingTime", 0);
        tooltip.append(Component.translatable("mobseed.remaining_time", remainingTime));

        if (accessor.getServerData().getBooleanOr("PlayerTooClose", false))
        {
            tooltip.add(Component.translatable("mobseed.tooclose"));
        }
    }

    @Override
    public Identifier getUid()
    {
        return Identifier.fromNamespaceAndPath(HavenAnimalSeeds.MOD_ID, "mobseed_remaining_time");
    }
}
