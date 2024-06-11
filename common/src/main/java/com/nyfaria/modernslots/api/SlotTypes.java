package com.nyfaria.modernslots.api;

import java.util.ArrayList;
import java.util.List;

public class SlotTypes {
    public static List<SlotType> TYPES = new ArrayList<>();
    public static SlotType ACTIVE =  register("active");
    public static SlotType COSMETIC = register("cosmetic");

    public static SlotType register(String name) {
        SlotType type = new SlotType(name);
        TYPES.add(type);
        return type;
    }
}
