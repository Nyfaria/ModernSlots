package com.nyfaria.modernslots.api;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class SlotsHolder {
    public static Codec<SlotsHolder> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ModernSlot.CODEC.listOf().fieldOf("slots").forGetter(SlotsHolder::getSlots)
    ).apply(instance, SlotsHolder::new));

    public List<ModernSlot> slots = new ArrayList<>();

    public SlotsHolder() {
        SlotInfo.SLOT_INFOS.forEach(
                (location, slotInfo) -> {
                    for (int i = 0; i < slotInfo.count(); i++) {
                        slots.add(new ModernSlot(slotInfo.type(), ItemStack.EMPTY));
                    }
                }
        );
    }

    public SlotsHolder(List<ModernSlot> slots) {
        this.slots.addAll(slots);
    }

    public List<ModernSlot> getSlots() {
        return slots;
    }
}
