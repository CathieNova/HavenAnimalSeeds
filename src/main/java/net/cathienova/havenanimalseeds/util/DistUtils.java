package net.cathienova.havenanimalseeds.util;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.loading.FMLEnvironment;

public class DistUtils {
    public static void runIfClient(Runnable action) {
        if (FMLEnvironment.dist == Dist.CLIENT) {
            action.run();
        }
    }
}
