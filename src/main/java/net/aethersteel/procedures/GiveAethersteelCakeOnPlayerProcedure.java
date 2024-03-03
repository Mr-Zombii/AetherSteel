//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.aethersteel.procedures;

import java.util.Calendar;
import java.util.Objects;

import net.aethersteel.init.AethersteelModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class GiveAethersteelCakeOnPlayerProcedure {
    public GiveAethersteelCakeOnPlayerProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (Calendar.getInstance().get(2) == 0 == (Calendar.getInstance().get(5) == 31)) {
                if (entity instanceof Player) {
                    Player _playerHasItem = (Player)entity;
                    if (_playerHasItem.getInventory().add(new ItemStack(AethersteelModBlocks.AETHERSTEEL_CAKE.get()))) {
                        return;
                    }
                }

                Player _player;
                if (entity instanceof Player) {
                    _player = (Player)entity;
                    ItemStack _setstack = new ItemStack(AethersteelModBlocks.AETHERSTEEL_CAKE.get());
                    _setstack.grow(1);
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }

                if (entity instanceof Player) {
                    _player = (Player)entity;
                    if (!_player.level.isClientSide()) {
                        _player.displayClientMessage(Component.nullToEmpty("Happy Birthday §dAethersteel!"), false);
                    }
                }

                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch"))), SoundSource.AMBIENT, 1.0F, 1.0F);
                    } else {
                        _level.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch"))), SoundSource.AMBIENT, 1.0F, 1.0F, false);
                    }
                }
            }

        }
    }
}
