package com.nyfaria.modernslots.api;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public record ModernSlot(SlotType slotType, ItemStack itemStack) {
    public static Codec<ModernSlot> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            SlotType.CODEC.fieldOf("slotType").forGetter(ModernSlot::slotType),
            ItemStack.CODEC.fieldOf("itemStack").forGetter(ModernSlot::itemStack)
    ).apply(instance, ModernSlot::new));
}
