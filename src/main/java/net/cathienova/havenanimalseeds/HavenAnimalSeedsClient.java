package net.cathienova.havenanimalseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.item.MobSeedItem;
import net.cathienova.havenanimalseeds.util.MobSeedRenderer;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import net.neoforged.neoforge.event.level.LevelEvent;

import java.util.List;

@EventBusSubscriber(modid = HavenAnimalSeeds.MOD_ID, value = Dist.CLIENT)
public class HavenAnimalSeedsClient
{
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerBlockEntityRenderer(ModBlockEntities.mob_seed.get(), MobSeedRenderer::new);
    }

    @SubscribeEvent
    public static void addSeedTooltips(ItemTooltipEvent event)
    {
        if (event.getItemStack().getItem() instanceof MobSeedItem seedItem)
        {
            List<Component> toolTip = event.getToolTip();
            toolTip.addAll(Math.min(1, toolTip.size()), seedItem.getPlacementTooltips());
        }
    }

    @SubscribeEvent
    public static void onLevelUnload(LevelEvent.Unload event)
    {
        MobSeedRenderer.clearModels(event.getLevel());
    }
}