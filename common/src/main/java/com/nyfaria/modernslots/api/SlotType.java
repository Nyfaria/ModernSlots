package com.nyfaria.modernslots.api;

import com.mojang.serialization.Codec;

public record SlotType(String name) {
    public static Codec<SlotType> CODEC = Codec.STRING.xmap(SlotType::new, SlotType::name);
}
