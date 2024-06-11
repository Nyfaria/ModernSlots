package com.nyfaria.modernslots;

import com.nyfaria.modernslots.init.BlockInit;
import com.nyfaria.modernslots.init.EntityInit;
import com.nyfaria.modernslots.init.ItemInit;
import com.nyfaria.modernslots.init.TagInit;

public class CommonClass {

    public static void init() {
        ItemInit.loadClass();
        BlockInit.loadClass();
        EntityInit.loadClass();
        TagInit.loadClass();
    }
}