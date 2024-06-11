package com.nyfaria.modernslots.api;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public record SlotInfo(SlotType type, int count) {
    public static Map<ResourceLocation,SlotInfo> SLOT_INFOS = new HashMap<>();
    public static Codec<SlotInfo> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            SlotType.CODEC.fieldOf("type").forGetter(SlotInfo::type),
            Codec.INT.fieldOf("count").forGetter(SlotInfo::count)
    ).apply(instance, SlotInfo::new));
}
