package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.level.block.state.BlockState;

public class AxolotlSeedEntity extends MobSeedEntity<Axolotl> {
    public AxolotlSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.axolotl_seed_tile.get(), pos, state, HavenConfig.axolotl_seed_spawn_timer, EntityType.AXOLOTL, HavenConfig.axolotl_seed_spawn_timer);
    }
}
