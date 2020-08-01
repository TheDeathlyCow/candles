package com.github.thedeathlycow.candles.blocks;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.Random;

public class BeeswaxCandle extends BushBlock {

    public static final IntegerProperty CANDLES = IntegerProperty.create("candles", 1, 4);
    protected static final VoxelShape ONE_SHAPE = Block.makeCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 6.0D, 10.0D);
    protected static final VoxelShape TWO_SHAPE = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 6.0D, 13.0D);
    protected static final VoxelShape THREE_SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 6.0D, 14.0D);
    protected static final VoxelShape FOUR_SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 7.0D, 14.0D);

    protected final IParticleData particleData;

    public BeeswaxCandle(Properties blockProperties, IParticleData particleData) {
        super(blockProperties);
        this.setDefaultState(this.stateContainer.getBaseState().with(CANDLES, Integer.valueOf(1)));
        this.particleData = particleData;
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockState blockstate = context.getWorld().getBlockState(context.getPos());
        if (blockstate.isIn(this)) {
            return blockstate.with(CANDLES, Integer.valueOf(Math.min(4, blockstate.get(CANDLES) + 1)));
        } else {
            return this.getDefaultState();
        }
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
//    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
//        if (!stateIn.isValidPosition(worldIn, currentPos)) {
//            return Blocks.AIR.getDefaultState();
//        } else {
//            return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
//        }
//    }

    /**
     * Called periodically clientside on blocks near the player to show effects (like furnace fire particles). Note that
     * this method is unrelated to {randomTick} and {#needsRandomTick}, and will always be called regardless
     * of whether the block can receive random update ticks
     */
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        switch(stateIn.get(CANDLES)) {
            case 1:
            default:
                this.oneFlame(worldIn, pos);
                break;
            case 2:
                this.twoFlames(worldIn, pos);
                break;
            case 3:
                this.threeFlames(worldIn, pos);
                break;
            case 4:
                this.fourFlames(worldIn, pos);
                break;
        }
    }

    private void oneFlame(World worldIn, BlockPos pos) {
        this.addParticles(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D);
    }

    private void twoFlames(World worldIn, BlockPos pos) {
        this.addParticles(worldIn, (double)pos.getX() + 0.7D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.7D);
        this.addParticles(worldIn, (double)pos.getX() + 0.4D, (double)pos.getY() + 0.4D, (double)pos.getZ() + 0.4D);
    }

    private void threeFlames(World worldIn, BlockPos pos) {
        this.addParticles(worldIn, (double)pos.getX() + 0.75D, (double)pos.getY() + 0.4D, (double)pos.getZ() + 0.25D);
        this.addParticles(worldIn, (double)pos.getX() + 0.65D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.6D);
        this.addParticles(worldIn, (double)pos.getX() + 0.3D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.55D);
    }

    private void fourFlames(World worldIn, BlockPos pos) {
        this.addParticles(worldIn, (double)pos.getX() + 0.75D, (double)pos.getY() + 0.4D, (double)pos.getZ() + 0.3D);
        this.addParticles(worldIn, (double)pos.getX() + 0.6D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.75D);
        this.addParticles(worldIn, (double)pos.getX() + 0.25D, (double)pos.getY() + 0.45D, (double)pos.getZ() + 0.75D);
        this.addParticles(worldIn, (double)pos.getX() + 0.25D, (double)pos.getY() + 0.45D, (double)pos.getZ() + 0.3D);
    }

    private void addParticles(World worldIn, double x, double y, double z) {
        worldIn.addParticle(ParticleTypes.SMOKE, x, y, z, 0.0D, 0.0D, 0.0D);
        worldIn.addParticle(this.particleData, x, y, z, 0.0D, 0.0D, 0.0D);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(CANDLES);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch(state.get(CANDLES)) {
            case 1:
            default:
                return ONE_SHAPE;
            case 2:
                return TWO_SHAPE;
            case 3:
                return THREE_SHAPE;
            case 4:
                return FOUR_SHAPE;
        }
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.down();
        return this.isValidGround(worldIn.getBlockState(blockpos), worldIn, blockpos);
    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return !state.getCollisionShape(worldIn, pos).project(Direction.UP).isEmpty();
    }

    public boolean isReplaceable(BlockState state, BlockItemUseContext useContext) {
        return useContext.getItem().getItem() == this.asItem() && state.get(CANDLES) < 4;
    }

    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return false;
    }

}
