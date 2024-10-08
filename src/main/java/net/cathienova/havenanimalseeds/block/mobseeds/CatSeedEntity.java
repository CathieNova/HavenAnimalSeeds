package net.cathienova.havenanimalseeds.block.mobseeds;

import net.cathienova.havenanimalseeds.block.ModBlockEntities;
import net.cathienova.havenanimalseeds.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.level.block.state.BlockState;

public class CatSeedEntity extends MobSeedEntity<Cat> {
    public CatSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.cat_seed_tile.get(), pos, state, HavenConfig.cat_seed_spawn_timer, EntityType.CAT, HavenConfig.cat_seed_spawn_timer);
    }

    /*@Override
    protected void setMobVariant(Cat mob)
    {
        List<ResourceKey<CatVariant>> variants = List.of(
                CatVariant.TABBY,
                CatVariant.BLACK,
                CatVariant.RED,
                CatVariant.SIAMESE,
                CatVariant.BRITISH_SHORTHAIR,
                CatVariant.CALICO,
                CatVariant.PERSIAN,
                CatVariant.RAGDOLL,
                CatVariant.WHITE,
                CatVariant.JELLIE,
                CatVariant.ALL_BLACK
        );
        Random random = new Random();
        ResourceKey<CatVariant> variantKey = variants.get(random.nextInt(variants.size()));
        Optional<CatVariant> variant = BuiltInRegistries.CAT_VARIANT.getOptional(variantKey);
        variant.ifPresent(mob::setVariant);
    }*/
}
