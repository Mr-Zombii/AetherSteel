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
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class AethersteelScrapItem extends Item {
    public AethersteelScrapItem() {
        super((new Item.Properties()).tab(AethersteelModTabs.TAB_AETHERSTEEL_CREATIVE_TAB).stacksTo(64).setNoRepair().rarity(Rarity.COMMON));
    }

    public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, level, list, flag);
    }
}
