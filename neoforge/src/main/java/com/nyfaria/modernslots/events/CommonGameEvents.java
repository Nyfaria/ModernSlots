package com.nyfaria.modernslots.events;

import com.nyfaria.modernslots.data.SlotReloadListener;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AddReloadListenerEvent;

@EventBusSubscriber(bus=EventBusSubscriber.Bus.GAME)
public class CommonGameEvents {
    @SubscribeEvent
    public static void onReloadListeners(AddReloadListenerEvent event) {
        event.addListener(new SlotReloadListener());
    }
}
