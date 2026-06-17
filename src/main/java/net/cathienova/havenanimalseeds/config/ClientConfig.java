package net.cathienova.havenanimalseeds.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ClientConfig
{
    public final ModConfigSpec.IntValue seedModelRenderDistance;

    public ClientConfig(ModConfigSpec.Builder builder)
    {
        builder.comment("Seed Models").push("seedModels");
        seedModelRenderDistance = builder.comment("The maximum distance in blocks that growing animal models are rendered. Lower values improve FPS when many seeds are placed.").defineInRange("seedModelRenderDistance", 48, 8, 128);
        builder.pop();
    }
}