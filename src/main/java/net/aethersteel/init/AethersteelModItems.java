package net.aethersteel.init;

import net.aethersteel.item.AethersteelArmorItem;
import net.aethersteel.item.AethersteelAxeItem;
import net.aethersteel.item.AethersteelHoeItem;
import net.aethersteel.item.AethersteelIngotItem;
import net.aethersteel.item.AethersteelKnifeItem;
import net.aethersteel.item.AethersteelNuggetItem;
import net.aethersteel.item.AethersteelPickaxeItem;
import net.aethersteel.item.AethersteelScrapItem;
import net.aethersteel.item.AethersteelShearsItem;
import net.aethersteel.item.AethersteelShovelItem;
import net.aethersteel.item.AethersteelSwordItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AethersteelModItems {
    public static final DeferredRegister<Item> REGISTRY;
    public static final RegistryObject<Item> AETHER_DEBRIS;
    public static final RegistryObject<Item> AETHERSTEEL_SCRAP;
    public static final RegistryObject<Item> AETHERSTEEL_INGOT;
    public static final RegistryObject<Item> AETHERSTEEL_NUGGET;
    public static final RegistryObject<Item> AETHERSTEEL_SHOVEL;
    public static final RegistryObject<Item> AETHERSTEEL_PICKAXE;
    public static final RegistryObject<Item> AETHERSTEEL_AXE;
    public static final RegistryObject<Item> AETHERSTEEL_HOE;
    public static final RegistryObject<Item> AETHERSTEEL_SWORD;
    public static final RegistryObject<Item> AETHERSTEEL_KNIFE;
    public static final RegistryObject<Item> AETHERSTEEL_SHEARS;
    public static final RegistryObject<Item> AETHERSTEEL_ARMOR_HELMET;
    public static final RegistryObject<Item> AETHERSTEEL_ARMOR_CHESTPLATE;
    public static final RegistryObject<Item> AETHERSTEEL_ARMOR_LEGGINGS;
    public static final RegistryObject<Item> AETHERSTEEL_ARMOR_BOOTS;
    public static final RegistryObject<Item> AETHERSTEEL_BLOCK;
    public static final RegistryObject<Item> AETHERSTEEL_BOOKSHELF;
    public static final RegistryObject<Item> AETHERSTEEL_SLAB;
    public static final RegistryObject<Item> AETHERSTEEL_STAIRS;
    public static final RegistryObject<Item> AETHERSTEEL_DOOR;
    public static final RegistryObject<Item> AETHERSTEEL_TRAPDOOR;
    public static final RegistryObject<Item> AETHERSTEEL_BUTTON;
    public static final RegistryObject<Item> AETHERSTEEL_PRESSURE_PLATE;
    public static final RegistryObject<Item> AETHERSTEEL_CHAIN;
    public static final RegistryObject<Item> AETHERSLATE;
    public static final RegistryObject<Item> COBBLED_AETHERSLATE;
    public static final RegistryObject<Item> COBBLED_AETHERSLATE_SLAB;
    public static final RegistryObject<Item> COBBLED_AETHERSLATE_STAIRS;
    public static final RegistryObject<Item> COBBLED_AETHERSLATE_WALL;
    public static final RegistryObject<Item> AETHERSLATE_BRICKS;
    public static final RegistryObject<Item> CRACKED_AETHERSLATE_BRICKS;
    public static final RegistryObject<Item> AETHERSLATE_BRICKS_SLAB;
    public static final RegistryObject<Item> AETHERSLATE_BRICKS_STAIRS;
    public static final RegistryObject<Item> AETHERSLATE_BRICKS_WALL;
    public static final RegistryObject<Item> AETHERSLATE_TILES;
    public static final RegistryObject<Item> CRACKED_AETHERSLATE_TILES;
    public static final RegistryObject<Item> AETHERSLATE_TILES_SLAB;
    public static final RegistryObject<Item> AETHERSLATE_TILES_STAIRS;
    public static final RegistryObject<Item> AETHERSLATE_TILES_WALL;
    public static final RegistryObject<Item> POLISHED_AETHERSLATE;
    public static final RegistryObject<Item> POLISHED_AETHERSLATE_SLAB;
    public static final RegistryObject<Item> POLISHED_AETHERSLATE_STAIRS;
    public static final RegistryObject<Item> POLISHED_AETHERSLATE_WALL;
    public static final RegistryObject<Item> CHISELED_AETHERSLATE;
    public static final RegistryObject<Item> SUSPICIOUS_AETHERSLATE;
    public static final RegistryObject<Item> AETHERSTEEL_CAKE;

    public AethersteelModItems() {
    }

    private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
        return REGISTRY.register(block.getId().getPath(), () -> {
            return new BlockItem(block.get(), (new Item.Properties()).tab(tab));
        });
    }

    private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
        return REGISTRY.register(block.getId().getPath(), () -> {
            return new DoubleHighBlockItem(block.get(), (new Item.Properties()).tab(tab));
        });
    }

    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "aethersteel");
        AETHER_DEBRIS = block(AethersteelModBlocks.AETHER_DEBRIS, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSTEEL_SCRAP = REGISTRY.register("aethersteel_scrap", () -> {
            return new AethersteelScrapItem();
        });
        AETHERSTEEL_INGOT = REGISTRY.register("aethersteel_ingot", () -> {
            return new AethersteelIngotItem();
        });
        AETHERSTEEL_NUGGET = REGISTRY.register("aethersteel_nugget", () -> {
            return new AethersteelNuggetItem();
        });
        AETHERSTEEL_SHOVEL = REGISTRY.register("aethersteel_shovel", () -> {
            return new AethersteelShovelItem();
        });
        AETHERSTEEL_PICKAXE = REGISTRY.register("aethersteel_pickaxe", () -> {
            return new AethersteelPickaxeItem();
        });
        AETHERSTEEL_AXE = REGISTRY.register("aethersteel_axe", () -> {
            return new AethersteelAxeItem();
        });
        AETHERSTEEL_HOE = REGISTRY.register("aethersteel_hoe", () -> {
            return new AethersteelHoeItem();
        });
        AETHERSTEEL_SWORD = REGISTRY.register("aethersteel_sword", () -> {
            return new AethersteelSwordItem();
        });
        AETHERSTEEL_KNIFE = REGISTRY.register("aethersteel_knife", () -> {
            return new AethersteelKnifeItem();
        });
        AETHERSTEEL_SHEARS = REGISTRY.register("aethersteel_shears", () -> {
            return new AethersteelShearsItem();
        });
        AETHERSTEEL_ARMOR_HELMET = REGISTRY.register("aethersteel_armor_helmet", () -> {
            return new AethersteelArmorItem.Helmet();
        });
        AETHERSTEEL_ARMOR_CHESTPLATE = REGISTRY.register("aethersteel_armor_chestplate", () -> {
            return new AethersteelArmorItem.Chestplate();
        });
        AETHERSTEEL_ARMOR_LEGGINGS = REGISTRY.register("aethersteel_armor_leggings", () -> {
            return new AethersteelArmorItem.Leggings();
        });
        AETHERSTEEL_ARMOR_BOOTS = REGISTRY.register("aethersteel_armor_boots", () -> {
            return new AethersteelArmorItem.Boots();
        });
        AETHERSTEEL_BLOCK = block(AethersteelModBlocks.AETHERSTEEL_BLOCK, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSTEEL_BOOKSHELF = block(AethersteelModBlocks.AETHERSTEEL_BOOKSHELF, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSTEEL_SLAB = block(AethersteelModBlocks.AETHERSTEEL_SLAB, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSTEEL_STAIRS = block(AethersteelModBlocks.AETHERSTEEL_STAIRS, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSTEEL_DOOR = doubleBlock(AethersteelModBlocks.AETHERSTEEL_DOOR, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSTEEL_TRAPDOOR = block(AethersteelModBlocks.AETHERSTEEL_TRAPDOOR, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSTEEL_BUTTON = block(AethersteelModBlocks.AETHERSTEEL_BUTTON, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSTEEL_PRESSURE_PLATE = block(AethersteelModBlocks.AETHERSTEEL_PRESSURE_PLATE, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSTEEL_CHAIN = block(AethersteelModBlocks.AETHERSTEEL_CHAIN, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSLATE = block(AethersteelModBlocks.AETHERSLATE, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        COBBLED_AETHERSLATE = block(AethersteelModBlocks.COBBLED_AETHERSLATE, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        COBBLED_AETHERSLATE_SLAB = block(AethersteelModBlocks.COBBLED_AETHERSLATE_SLAB, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        COBBLED_AETHERSLATE_STAIRS = block(AethersteelModBlocks.COBBLED_AETHERSLATE_STAIRS, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        COBBLED_AETHERSLATE_WALL = block(AethersteelModBlocks.COBBLED_AETHERSLATE_WALL, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSLATE_BRICKS = block(AethersteelModBlocks.AETHERSLATE_BRICKS, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        CRACKED_AETHERSLATE_BRICKS = block(AethersteelModBlocks.CRACKED_AETHERSLATE_BRICKS, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSLATE_BRICKS_SLAB = block(AethersteelModBlocks.AETHERSLATE_BRICKS_SLAB, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSLATE_BRICKS_STAIRS = block(AethersteelModBlocks.AETHERSLATE_BRICKS_STAIRS, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSLATE_BRICKS_WALL = block(AethersteelModBlocks.AETHERSLATE_BRICKS_WALL, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSLATE_TILES = block(AethersteelModBlocks.AETHERSLATE_TILES, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        CRACKED_AETHERSLATE_TILES = block(AethersteelModBlocks.CRACKED_AETHERSLATE_TILES, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSLATE_TILES_SLAB = block(AethersteelModBlocks.AETHERSLATE_TILES_SLAB, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSLATE_TILES_STAIRS = block(AethersteelModBlocks.AETHERSLATE_TILES_STAIRS, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSLATE_TILES_WALL = block(AethersteelModBlocks.AETHERSLATE_TILES_WALL, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        POLISHED_AETHERSLATE = block(AethersteelModBlocks.POLISHED_AETHERSLATE, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        POLISHED_AETHERSLATE_SLAB = block(AethersteelModBlocks.POLISHED_AETHERSLATE_SLAB, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        POLISHED_AETHERSLATE_STAIRS = block(AethersteelModBlocks.POLISHED_AETHERSLATE_STAIRS, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        POLISHED_AETHERSLATE_WALL = block(AethersteelModBlocks.POLISHED_AETHERSLATE_WALL, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        CHISELED_AETHERSLATE = block(AethersteelModBlocks.CHISELED_AETHERSLATE, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        SUSPICIOUS_AETHERSLATE = block(AethersteelModBlocks.SUSPICIOUS_AETHERSLATE, AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB);
        AETHERSTEEL_CAKE = block(AethersteelModBlocks.AETHERSTEEL_CAKE, (CreativeModeTab)null);
    }
}
