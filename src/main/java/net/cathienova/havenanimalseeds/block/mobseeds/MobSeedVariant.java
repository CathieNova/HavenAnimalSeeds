package net.cathienova.havenanimalseeds.block.mobseeds;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.storage.TagValueInput;
import net.minecraft.world.level.storage.TagValueOutput;
import net.neoforged.neoforge.event.EventHooks;
import org.jspecify.annotations.Nullable;

public final class MobSeedVariant
{
    private MobSeedVariant()
    {
    }

    public static @Nullable CompoundTag create(ServerLevel level, BlockPos pos, EntityType<? extends Mob> entityType)
    {
        Mob mob = entityType.create(level, EntitySpawnReason.EVENT);
        if (mob == null)
        {
            return null;
        }

        mob.setPos(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D);
        CompoundTag before = save(mob);
        if (before == null)
        {
            return null;
        }

        EventHooks.finalizeMobSpawn(mob, level, level.getCurrentDifficultyAt(pos), EntitySpawnReason.EVENT, null);
        CompoundTag after = save(mob);
        if (after == null)
        {
            return null;
        }

        return findChanges(before, after);
    }

    public static boolean loadVariant(Mob mob, CompoundTag changes)
    {
        if (changes.isEmpty())
        {
            return true;
        }

        CompoundTag current = save(mob);
        if (current == null)
        {
            return false;
        }

        mergeChanges(current, changes);
        ProblemReporter.Collector reporter = new ProblemReporter.Collector();
        mob.load(TagValueInput.create(reporter, mob.registryAccess(), current));
        return reporter.isEmpty();
    }

    private static @Nullable CompoundTag save(Mob mob)
    {
        ProblemReporter.Collector reporter = new ProblemReporter.Collector();
        TagValueOutput output = TagValueOutput.createWithContext(reporter, mob.registryAccess());
        if (!mob.save(output) || !reporter.isEmpty())
        {
            return null;
        }

        return output.buildResult();
    }

    private static CompoundTag findChanges(CompoundTag before, CompoundTag after)
    {
        CompoundTag changes = new CompoundTag();

        for (var entry : after.entrySet())
        {
            String key = entry.getKey();
            Tag oldValue = before.get(key);
            Tag newValue = entry.getValue();

            if (oldValue instanceof CompoundTag oldCompound && newValue instanceof CompoundTag newCompound)
            {
                CompoundTag nestedChanges = findChanges(oldCompound, newCompound);
                if (!nestedChanges.isEmpty())
                {
                    changes.put(key, nestedChanges);
                }
            }
            else if (!newValue.equals(oldValue))
            {
                changes.put(key, newValue.copy());
            }
        }

        return changes;
    }

    private static void mergeChanges(CompoundTag current, CompoundTag changes)
    {
        for (var entry : changes.entrySet())
        {
            String key = entry.getKey();
            Tag changedValue = entry.getValue();
            Tag currentValue = current.get(key);

            if (currentValue instanceof CompoundTag currentCompound && changedValue instanceof CompoundTag changedCompound)
            {
                mergeChanges(currentCompound, changedCompound);
            }
            else
            {
                current.put(key, changedValue.copy());
            }
        }
    }
}