package net.aethersteel.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

public class AethersteelModTabs {
    public static CreativeModeTab TAB_AETHERSTEEL_CREATIVE_TAB;

    public AethersteelModTabs() {
    }

    public static void load() {
        TAB_AETHERSTEEL_CREATIVE_TAB = new CreativeModeTab("tabaethersteel_creative_tab") {
            @Override
            public @NotNull ItemStack makeIcon() {
                return new ItemStack(AethersteelModItems.AETHERSTEEL_INGOT.get());
            }

            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
