package client.modules;

import client.modules.Movement.Sprint;
import net.minecraft.client.Minecraft;

public class Module {
    public String name;
    public boolean toogled;
    public int keyCode;

    public Minecraft mc = Minecraft.getMinecraft();
    public boolean alwaysactive;

    public Module(String name, int key, Category c) {
        this.name = name;
        this.keyCode = key;
    }
    public boolean isEnabled() {
        return toogled;
    }
    public void toogle() {
        toogled = !toogled;
        System.out.println("now" + toogled);
        if (toogled) {
            onEnable();
        } else {
            onDisable();
        }
        System.out.println("now" + toogled);
    }
public int getKey() {
        return keyCode;
}
    public void onDisable() {
    }

    public void onEnable() {
    }
    public void onEvent() {

    }
    public boolean getType() {
        return alwaysactive;
    }
    public enum Category {
        COMBAT,
        MOVEMENT,
        PLAYER,
        RENDER;
    }
}
