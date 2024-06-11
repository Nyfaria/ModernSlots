package com.nyfaria.modernslots;


import com.nyfaria.modernslots.api.SlotsHolder;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;

@Mod(Constants.MODID)
public class ModernSlots {

    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, Constants.MODID);

    public static final DeferredHolder<AttachmentType<?>,AttachmentType<SlotsHolder>> SLOTS_HOLDER = ATTACHMENT_TYPES.register("slots_holder", () -> AttachmentType.builder(()->new SlotsHolder())
            .serialize(SlotsHolder.CODEC)
            .copyOnDeath()
            .build());

    public ModernSlots(IEventBus eventBus) {
        CommonClass.init();
    }
}