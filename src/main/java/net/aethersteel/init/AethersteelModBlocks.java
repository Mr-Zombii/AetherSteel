package net.aethersteel.init;

import net.aethersteel.block.AetherDebrisBlock;
import net.aethersteel.block.AetherslateBlock;
import net.aethersteel.block.AetherslateBricksBlock;
import net.aethersteel.block.AetherslateBricksSlabBlock;
import net.aethersteel.block.AetherslateBricksStairsBlock;
import net.aethersteel.block.AetherslateBricksWallBlock;
import net.aethersteel.block.AetherslateTilesBlock;
import net.aethersteel.block.AetherslateTilesSlabBlock;
import net.aethersteel.block.AetherslateTilesStairsBlock;
import net.aethersteel.block.AetherslateTilesWallBlock;
import net.aethersteel.block.AethersteelBlockBlock;
import net.aethersteel.block.AethersteelBookshelfBlock;
import net.aethersteel.block.AethersteelButtonBlock;
import net.aethersteel.block.AethersteelCakeBlock;
import net.aethersteel.block.AethersteelChainBlock;
import net.aethersteel.block.AethersteelDoorBlock;
import net.aethersteel.block.AethersteelPressurePlateBlock;
import net.aethersteel.block.AethersteelSlabBlock;
import net.aethersteel.block.AethersteelStairsBlock;
import net.aethersteel.block.AethersteelTrapdoorBlock;
import net.aethersteel.block.ChiseledAetherslateBlock;
import net.aethersteel.block.CobbledAetherslateBlock;
import net.aethersteel.block.CobbledAetherslateSlabBlock;
import net.aethersteel.block.CobbledAetherslateStairsBlock;
import net.aethersteel.block.CobbledAetherslateWallBlock;
import net.aethersteel.block.CrackedAetherslateBricksBlock;
import net.aethersteel.block.CrackedAetherslateTilesBlock;
import net.aethersteel.block.PolishedAetherslateBlock;
import net.aethersteel.block.PolishedAetherslateSlabBlock;
import net.aethersteel.block.PolishedAetherslateStairsBlock;
import net.aethersteel.block.PolishedAetherslateWallBlock;
import net.aethersteel.block.SuspiciousAetherslateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AethersteelModBlocks {
    public static final DeferredRegister<Block> REGISTRY;
    public static final RegistryObject<Block> AETHER_DEBRIS;
    public static final RegistryObject<Block> AETHERSTEEL_BLOCK;
    public static final RegistryObject<Block> AETHERSTEEL_BOOKSHELF;
    public static final RegistryObject<Block> AETHERSTEEL_SLAB;
    public static final RegistryObject<Block> AETHERSTEEL_STAIRS;
    public static final RegistryObject<Block> AETHERSTEEL_DOOR;
    public static final RegistryObject<Block> AETHERSTEEL_TRAPDOOR;
    public static final RegistryObject<Block> AETHERSTEEL_BUTTON;
    public static final RegistryObject<Block> AETHERSTEEL_PRESSURE_PLATE;
    public static final RegistryObject<Block> AETHERSTEEL_CHAIN;
    public static final RegistryObject<Block> AETHERSLATE;
    public static final RegistryObject<Block> COBBLED_AETHERSLATE;
    public static final RegistryObject<Block> COBBLED_AETHERSLATE_SLAB;
    public static final RegistryObject<Block> COBBLED_AETHERSLATE_STAIRS;
    public static final RegistryObject<Block> COBBLED_AETHERSLATE_WALL;
    public static final RegistryObject<Block> AETHERSLATE_BRICKS;
    public static final RegistryObject<Block> CRACKED_AETHERSLATE_BRICKS;
    public static final RegistryObject<Block> AETHERSLATE_BRICKS_SLAB;
    public static final RegistryObject<Block> AETHERSLATE_BRICKS_STAIRS;
    public static final RegistryObject<Block> AETHERSLATE_BRICKS_WALL;
    public static final RegistryObject<Block> AETHERSLATE_TILES;
    public static final RegistryObject<Block> CRACKED_AETHERSLATE_TILES;
    public static final RegistryObject<Block> AETHERSLATE_TILES_SLAB;
    public static final RegistryObject<Block> AETHERSLATE_TILES_STAIRS;
    public static final RegistryObject<Block> AETHERSLATE_TILES_WALL;
    public static final RegistryObject<Block> POLISHED_AETHERSLATE;
    public static final RegistryObject<Block> POLISHED_AETHERSLATE_SLAB;
    public static final RegistryObject<Block> POLISHED_AETHERSLATE_STAIRS;
    public static final RegistryObject<Block> POLISHED_AETHERSLATE_WALL;
    public static final RegistryObject<Block> CHISELED_AETHERSLATE;
    public static final RegistryObject<Block> SUSPICIOUS_AETHERSLATE;
    public static final RegistryObject<Block> AETHERSTEEL_CAKE;

    public AethersteelModBlocks() {
    }

    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "aethersteel");
        AETHER_DEBRIS = REGISTRY.register("aether_debris", () -> {
            return new AetherDebrisBlock();
        });
        AETHERSTEEL_BLOCK = REGISTRY.register("aethersteel_block", () -> {
            return new AethersteelBlockBlock();
        });
        AETHERSTEEL_BOOKSHELF = REGISTRY.register("aethersteel_bookshelf", () -> {
            return new AethersteelBookshelfBlock();
        });
        AETHERSTEEL_SLAB = REGISTRY.register("aethersteel_slab", () -> {
            return new AethersteelSlabBlock();
        });
        AETHERSTEEL_STAIRS = REGISTRY.register("aethersteel_stairs", () -> {
            return new AethersteelStairsBlock();
        });
        AETHERSTEEL_DOOR = REGISTRY.register("aethersteel_door", () -> {
            return new AethersteelDoorBlock();
        });
        AETHERSTEEL_TRAPDOOR = REGISTRY.register("aethersteel_trapdoor", () -> {
            return new AethersteelTrapdoorBlock();
        });
        AETHERSTEEL_BUTTON = REGISTRY.register("aethersteel_button", () -> {
            return new AethersteelButtonBlock();
        });
        AETHERSTEEL_PRESSURE_PLATE = REGISTRY.register("aethersteel_pressure_plate", () -> {
            return new AethersteelPressurePlateBlock();
        });
        AETHERSTEEL_CHAIN = REGISTRY.register("aethersteel_chain", () -> {
            return new AethersteelChainBlock();
        });
        AETHERSLATE = REGISTRY.register("aetherslate", () -> {
            return new AetherslateBlock();
        });
        COBBLED_AETHERSLATE = REGISTRY.register("cobbled_aetherslate", () -> {
            return new CobbledAetherslateBlock();
        });
        COBBLED_AETHERSLATE_SLAB = REGISTRY.register("cobbled_aetherslate_slab", () -> {
            return new CobbledAetherslateSlabBlock();
        });
        COBBLED_AETHERSLATE_STAIRS = REGISTRY.register("cobbled_aetherslate_stairs", () -> {
            return new CobbledAetherslateStairsBlock();
        });
        COBBLED_AETHERSLATE_WALL = REGISTRY.register("cobbled_aetherslate_wall", () -> {
            return new CobbledAetherslateWallBlock();
        });
        AETHERSLATE_BRICKS = REGISTRY.register("aetherslate_bricks", () -> {
            return new AetherslateBricksBlock();
        });
        CRACKED_AETHERSLATE_BRICKS = REGISTRY.register("cracked_aetherslate_bricks", () -> {
            return new CrackedAetherslateBricksBlock();
        });
        AETHERSLATE_BRICKS_SLAB = REGISTRY.register("aetherslate_bricks_slab", () -> {
            return new AetherslateBricksSlabBlock();
        });
        AETHERSLATE_BRICKS_STAIRS = REGISTRY.register("aetherslate_bricks_stairs", () -> {
            return new AetherslateBricksStairsBlock();
        });
        AETHERSLATE_BRICKS_WALL = REGISTRY.register("aetherslate_bricks_wall", () -> {
            return new AetherslateBricksWallBlock();
        });
        AETHERSLATE_TILES = REGISTRY.register("aetherslate_tiles", () -> {
            return new AetherslateTilesBlock();
        });
        CRACKED_AETHERSLATE_TILES = REGISTRY.register("cracked_aetherslate_tiles", () -> {
            return new CrackedAetherslateTilesBlock();
        });
        AETHERSLATE_TILES_SLAB = REGISTRY.register("aetherslate_tiles_slab", () -> {
            return new AetherslateTilesSlabBlock();
        });
        AETHERSLATE_TILES_STAIRS = REGISTRY.register("aetherslate_tiles_stairs", () -> {
            return new AetherslateTilesStairsBlock();
        });
        AETHERSLATE_TILES_WALL = REGISTRY.register("aetherslate_tiles_wall", () -> {
            return new AetherslateTilesWallBlock();
        });
        POLISHED_AETHERSLATE = REGISTRY.register("polished_aetherslate", () -> {
            return new PolishedAetherslateBlock();
        });
        POLISHED_AETHERSLATE_SLAB = REGISTRY.register("polished_aetherslate_slab", () -> {
            return new PolishedAetherslateSlabBlock();
        });
        POLISHED_AETHERSLATE_STAIRS = REGISTRY.register("polished_aetherslate_stairs", () -> {
            return new PolishedAetherslateStairsBlock();
        });
        POLISHED_AETHERSLATE_WALL = REGISTRY.register("polished_aetherslate_wall", () -> {
            return new PolishedAetherslateWallBlock();
        });
        CHISELED_AETHERSLATE = REGISTRY.register("chiseled_aetherslate", () -> {
            return new ChiseledAetherslateBlock();
        });
        SUSPICIOUS_AETHERSLATE = REGISTRY.register("suspicious_aetherslate", () -> {
            return new SuspiciousAetherslateBlock();
        });
        AETHERSTEEL_CAKE = REGISTRY.register("aethersteel_cake", () -> {
            return new AethersteelCakeBlock();
        });
    }
}