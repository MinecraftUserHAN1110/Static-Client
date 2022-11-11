package client.statics;

import org.lwjgl.opengl.Display;

public class Static {
    private static Static aStatic = new Static();

    public static Static getInstance() {
        return aStatic;
    }

    public void start() {
        Display.setTitle("Started");
    }
}
