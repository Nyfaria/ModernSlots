package com.nyfaria.modernslots.platform;

import com.nyfaria.modernslots.ModernSlots;
import com.nyfaria.modernslots.api.SlotsHolder;
import com.nyfaria.modernslots.platform.services.ISlotHolder;
import net.minecraft.world.entity.player.Player;

public class FabricSlotHolder implements ISlotHolder {
    @Override
    public SlotsHolder getSlotsHolder(Player player) {
        return player.getAttached(ModernSlots.SLOTS_HOLDER);
    }
}
