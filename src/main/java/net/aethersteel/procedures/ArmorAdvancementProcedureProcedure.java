package net.aethersteel.procedures;

import java.util.Iterator;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;

public class ArmorAdvancementProcedureProcedure {
    public ArmorAdvancementProcedureProcedure() {
    }

    public static void execute(Entity entity) {
        if (entity != null) {
            if (entity instanceof ServerPlayer) {
                ServerPlayer _player = (ServerPlayer) entity;
                Advancement _adv = _player.getServer().getAdvancements().getAdvancement(new ResourceLocation("aethersteel:aethersteel_armor_advancement"));
                AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
                if (!_ap.isDone()) {
                    Iterator _iterator = _ap.getCompletedCriteria().iterator();

                    while (_iterator.hasNext()) {
                        _player.getAdvancements().award(_adv, (String) _iterator.next());
                    }
                }
            }

        }
    }
}