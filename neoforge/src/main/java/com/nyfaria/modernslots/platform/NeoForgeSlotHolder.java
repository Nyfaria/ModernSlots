package com.nyfaria.modernslots.platform;

import com.nyfaria.modernslots.ModernSlots;
import com.nyfaria.modernslots.api.SlotsHolder;
import com.nyfaria.modernslots.platform.services.ISlotHolder;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public class NeoForgeSlotHolder implements ISlotHolder {

    @Override
    public SlotsHolder getSlotsHolder(Player player) {
        return player.getData(ModernSlots.SLOTS_HOLDER.get());
    }
}