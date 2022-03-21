package client;

import client.modules.Module;
import client.modules.Movement.Fly;
import client.modules.Movement.Sprint;
import net.minecraft.client.gui.GuiMultiplayer;
import org.lwjgl.opengl.Display;

import java.util.concurrent.CopyOnWriteArrayList;

public class Wrapper {
    public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<Module>();
    final String name = "V0iD";
    String version = "alpha";

    public void startup() {
System.out.println("Starting " + name + " " + version);
    Display.setTitle(name);
    loadModules();
    }

    public static void keyPress(int key) {
    for (Module m : modules) {
        if (m.getKey() == key) {
            m.toogle();

        }
            }
    }
    public static void onEvent() {

        if (modules.get(1).toogled) {
            modules.get(1).onEvent();
            }

        }


        //System.out.println(m.toogled);


    private void loadModules() {
        modules.add(new Fly());
        modules.add(new Sprint());
    }
}
