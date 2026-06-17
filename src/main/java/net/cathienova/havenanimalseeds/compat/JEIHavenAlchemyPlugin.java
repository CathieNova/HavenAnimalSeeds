package net.cathienova.havenanimalseeds.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.cathienova.havenanimalseeds.HavenAnimalSeeds;
import net.minecraft.resources.Identifier;

@JeiPlugin
public class JEIHavenAlchemyPlugin implements IModPlugin
{
    @Override
    public Identifier getPluginUid()
    {
        return Identifier.fromNamespaceAndPath(HavenAnimalSeeds.MOD_ID, "jei_plugin");
    }
}