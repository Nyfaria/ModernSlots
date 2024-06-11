package com.nyfaria.modernslots.data;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import com.nyfaria.modernslots.Constants;
import com.nyfaria.modernslots.api.SlotInfo;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Map;

public class SlotReloadListener extends SimpleJsonResourceReloadListener {


    public SlotReloadListener() {
        super(new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create(), "modernslots/slots");
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void apply(Map<ResourceLocation, JsonElement> pObject, ResourceManager pResourceManager, ProfilerFiller pProfiler) {
        int i = 2;
        pObject.forEach(
                (location, jsonElement) -> {
                    try {
                        SlotInfo slotInfo = SlotInfo.CODEC.decode(JsonOps.INSTANCE,jsonElement).getOrThrow().getFirst();
                        SlotInfo.SLOT_INFOS.put(location,slotInfo);
                    } catch (Exception e) {
                        Constants.LOG.error("Failed to load slot {}", location, e);
                    }
                }
        );
    }
}
