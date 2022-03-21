package client.modules.Movement;

import client.modules.Module;

public class Speed extends Module {
    public Speed(String name, int key, boolean type) {
        super(name, key, Category.MOVEMENT);
    }
    public void onEnable() {



    }
    public void onDisable() {
        mc.thePlayer.setSprinting(false);
        System.out.println("On disabled");
    }
    public void onEvent() {
        mc.thePlayer.setSprinting(true);


    }
}
