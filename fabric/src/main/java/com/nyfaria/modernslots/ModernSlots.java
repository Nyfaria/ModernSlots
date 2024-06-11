package com.nyfaria.modernslots;

import com.nyfaria.modernslots.api.SlotsHolder;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.impl.attachment.AttachmentEntrypoint;
import net.fabricmc.fabric.impl.attachment.AttachmentPersistentState;
import net.fabricmc.fabric.impl.attachment.AttachmentRegistryImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public class ModernSlots implements ModInitializer {

    public static AttachmentType<SlotsHolder> SLOTS_HOLDER =
            AttachmentRegistryImpl.<SlotsHolder>builder()
                    .initializer(SlotsHolder::new)
                    .persistent(SlotsHolder.CODEC)
                    .buildAndRegister(new ResourceLocation(Constants.MODID, "slots_holder"));

    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
    }
}
