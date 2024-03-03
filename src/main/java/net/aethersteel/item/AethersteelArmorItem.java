//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.aethersteel.item;

import java.util.List;
import net.aethersteel.init.AethersteelModItems;
import net.aethersteel.init.AethersteelModTabs;
import net.aethersteel.procedures.ArmorAdvancementProcedureProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class AethersteelArmorItem extends ArmorItem {
    public AethersteelArmorItem(EquipmentSlot slot, Item.Properties properties) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlot equipmentSlot) {
                return (new int[]{13, 15, 16, 11})[slot.getIndex()] * 100;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot equipmentSlot) {
                return (new int[]{13, 13, 13, 13})[slot.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 50;
            }

            @Override
            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike)AethersteelModItems.AETHERSTEEL_INGOT.get())});
            }

            @Override
            public String getName() {
                return "aethersteel_armor";
            }

            @Override
            public float getToughness() {
                return 0.0F;
            }

            @Override
            public float getKnockbackResistance() {
                return 1.0F;
            }

        }, slot, properties);
    }

    public static class Boots extends AethersteelArmorItem {
        public Boots() {
            super(EquipmentSlot.FEET, (new Item.Properties()).tab(AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB).setNoRepair());
        }

        public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
            super.appendHoverText(itemstack, level, list, flag);
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "aethersteel:textures/models/armor/aethersteel__layer_1.png";
        }

    }

    public static class Leggings extends AethersteelArmorItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, (new Item.Properties()).tab(AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB).setNoRepair());
        }

        public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
            super.appendHoverText(itemstack, level, list, flag);
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "aethersteel:textures/models/armor/aethersteel__layer_2.png";
        }

    }

    public static class Chestplate extends AethersteelArmorItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, (new Item.Properties()).tab(AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB).setNoRepair());
        }

        public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
            super.appendHoverText(itemstack, level, list, flag);
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "aethersteel:textures/models/armor/aethersteel__layer_1.png";
        }

    }

    public static class Helmet extends AethersteelArmorItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, (new Item.Properties()).tab(AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB).setNoRepair());
        }

        public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
            super.appendHoverText(itemstack, level, list, flag);
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "aethersteel:textures/models/armor/aethersteel__layer_1.png";
        }

    }
}
