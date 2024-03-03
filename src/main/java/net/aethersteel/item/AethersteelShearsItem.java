//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.aethersteel.item;

import java.util.List;
import net.aethersteel.init.AethersteelModTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class AethersteelShearsItem extends ShearsItem {
    public AethersteelShearsItem() {
        super((new Item.Properties()).tab(AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB).durability(2000).setNoRepair());
    }

    public int getEnchantmentValue() {
        return 2;
    }

    public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
        return 30.0F;
    }

    public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, level, list, flag);
    }
}
