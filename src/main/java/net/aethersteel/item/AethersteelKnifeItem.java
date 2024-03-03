//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.aethersteel.item;

import java.util.List;
import net.aethersteel.init.AethersteelModItems;
import net.aethersteel.init.AethersteelModTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;

public class AethersteelKnifeItem extends SwordItem {
    public AethersteelKnifeItem() {
        super(new Tier() {
            public int getUses() {
                return 3811;
            }

            public float getSpeed() {
                return 27.0F;
            }

            public float getAttackDamageBonus() {
                return 5.0F;
            }

            public int getLevel() {
                return 0;
            }

            public int getEnchantmentValue() {
                return 50;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike)AethersteelModItems.AETHERSTEEL_INGOT.get())});
            }
        }, 3, -2.0F, (new Item.Properties()).tab(AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB).setNoRepair());
    }

    public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, level, list, flag);
    }
}
