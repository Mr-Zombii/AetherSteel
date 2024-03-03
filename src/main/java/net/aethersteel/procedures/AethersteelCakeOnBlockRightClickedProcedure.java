//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.aethersteel.procedures;

import java.util.Calendar;
import java.util.Objects;

import net.aethersteel.init.AethersteelModItems;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class AethersteelCakeOnBlockRightClickedProcedure {
    public AethersteelCakeOnBlockRightClickedProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            Player _player;
            if (Calendar.getInstance().get(2) == 0 == (Calendar.getInstance().get(5) == 31)) {
                int var10000;
                if (entity instanceof Player) {
                    _player = (Player)entity;
                    var10000 = _player.getFoodData().getFoodLevel();
                } else {
                    var10000 = 0;
                }

                if (var10000 < 20 && entity instanceof Player) {
                    _player = (Player)entity;
                    FoodData var14 = _player.getFoodData();
                    int var10001;
                    if (entity instanceof Player) {
                        Player _plr = (Player)entity;
                        var10001 = _plr.getFoodData().getFoodLevel();
                    } else {
                        var10001 = 0;
                    }

                    var14.setFoodLevel(var10001 + 1);
                }

                world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.eat"))), SoundSource.PLAYERS, 0.5F, 0.8F);
                    } else {
                        _level.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.eat"))), SoundSource.PLAYERS, 0.5F, 0.8F, false);
                    }
                }

                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel)world;
                    _level.getServer().getCommands().performPrefixedCommand(
                            (
                                    new CommandSourceStack(
                                            CommandSource.NULL,
                                            new Vec3(x, y, z),
                                            Vec2.ZERO, _level,
                                            4,
                                            "",
                                            Component.nullToEmpty(""),
                                            _level.getServer(),
                                            null).withSuppressedOutput()
                            )
                            , "summon firework_rocket ~ ~ ~ {LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:2,Explosions:[{Type:1,Flicker:1,Trail:0,Colors:[I;8073150],FadeColors:[I;8073150]}]}}}}");
                }

                ItemStack _setstack;
                if (entity instanceof Player) {
                    _player = (Player)entity;
                    _setstack = new ItemStack(AethersteelModItems.AETHERSTEEL_INGOT.get());
                    _setstack.setCount(10);
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }

                if (entity instanceof Player) {
                    _player = (Player)entity;
                    _setstack = new ItemStack(Blocks.PURPLE_CANDLE);
                    _setstack.grow(1);
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            } else if (Calendar.getInstance().get(2) == 0 != (Calendar.getInstance().get(5) == 31) && entity instanceof Player) {
                _player = (Player)entity;
                if (!_player.level.isClientSide()) {
                    _player.displayClientMessage(Component.nullToEmpty("This cake was expired."), true);
                }
            }

        }
    }
}
