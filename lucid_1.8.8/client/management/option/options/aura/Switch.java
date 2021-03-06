/*
 * Decompiled with CFR 0_114.
 */
package client.management.option.options.aura;

import client.management.module.Module;
import client.management.option.Option;
import client.management.option.OptionManager;

public class Switch
extends Option {
    public Switch(String name, boolean value, Module mod) {
        super(name, value, mod);
    }

    @Override
    public void setValue(boolean value) {
        if (value) {
            OptionManager.getOption("Tick", this.mod).setValueHard(false);
        } else {
            OptionManager.getOption("Tick", this.mod).setValueHard(true);
        }
        super.setValue(value);
    }
}

