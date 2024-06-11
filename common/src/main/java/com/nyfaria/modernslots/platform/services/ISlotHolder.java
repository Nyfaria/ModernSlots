package com.nyfaria.modernslots.platform.services;

import com.nyfaria.modernslots.api.SlotsHolder;
import net.minecraft.world.entity.player.Player;

public interface ISlotHolder {

    SlotsHolder getSlotsHolder(Player player);
}
