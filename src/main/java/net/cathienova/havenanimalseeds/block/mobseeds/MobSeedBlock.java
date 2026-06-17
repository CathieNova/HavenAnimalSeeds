package net.cathienova.havenanimalseeds.block.mobseeds;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.function.IntSupplier;

public class MobSeedBlock extends BaseEntityBlock
{
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    private static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);

    private final MapCodec<MobSeedBlock> codec = MapCodec.unit(this);
    private final EntityType<? extends Mob> entityType;
    private final IntSupplier growthTime;
    private final List<Block> placementBlocks;
    private final boolean canGrowOnBlocks;
    private final boolean canGrowInWater;

    public MobSeedBlock(Properties properties, EntityType<? extends Mob> entityType, IntSupplier growthTime, boolean canGrowOnBlocks, boolean canGrowInWater, Block... placementBlocks)
    {
        super(properties.noCollision().noOcclusion().instabreak());
        this.entityType = entityType;
        this.growthTime = growthTime;
        this.placementBlocks = List.of(placementBlocks);
        this.canGrowOnBlocks = canGrowOnBlocks;
        this.canGrowInWater = canGrowInWater;
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(WATERLOGGED, false)
                .setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<MobSeedBlock> codec()
    {
        return codec;
    }

    @Override
    public RenderShape getRenderShape(BlockState state)
    {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state)
    {
        return new MobSeedEntity(pos, state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(WATERLOGGED, BlockStateProperties.HORIZONTAL_FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
        return this.defaultBlockState()
                .setValue(WATERLOGGED, canGrowInWater && fluidState.getType() == Fluids.WATER)
                .setValue(BlockStateProperties.HORIZONTAL_FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos)
    {
        if (canGrowOnBlocks)
        {
            BlockState soil = level.getBlockState(pos.below());
            for (int index = 0; index < placementBlocks.size(); index++)
            {
                if (soil.is(placementBlocks.get(index)))
                {
                    return true;
                }
            }
        }

        if (canGrowInWater)
        {
            FluidState fluidState = level.getFluidState(pos);
            return level.getFluidState(pos.below()).getType() != Fluids.WATER
                    && fluidState.getType() == Fluids.WATER
                    && fluidState.getAmount() == 8;
        }

        return false;
    }

    @Override
    public FluidState getFluidState(BlockState state)
    {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, @Nullable Orientation orientation, boolean movedByPiston)
    {
        if (!state.canSurvive(level, pos))
        {
            level.scheduleTick(pos, this, 1);
        }
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random)
    {
        if (!state.canSurvive(level, pos))
        {
            level.setBlock(pos, state.getValue(WATERLOGGED) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
            return;
        }

        if (level.getBlockEntity(pos) instanceof MobSeedEntity mobSeedEntity)
        {
            mobSeedEntity.grow(level, pos, state);
        }

        if (level.getBlockState(pos).is(this))
        {
            level.scheduleTick(pos, this, MobSeedEntity.GROWTH_CHECK_INTERVAL);
        }
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context)
    {
        return SHAPE;
    }

    public EntityType<? extends Mob> getEntityType()
    {
        return entityType;
    }

    public int getGrowthTime()
    {
        return growthTime.getAsInt();
    }

    public List<Block> getPlacementBlocks()
    {
        return placementBlocks;
    }

    public boolean canGrowOnBlocks()
    {
        return canGrowOnBlocks;
    }

    public boolean canGrowInWater()
    {
        return canGrowInWater;
    }
}