package snowpaw.foxel.client;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import java.awt.*;
import static snowpaw.foxel.util.Constants.HEIGHT;
import static snowpaw.foxel.util.Constants.WIDTH;

public class OpenGlHelper {

    public static void initGl(){
        GL11.glViewport(0, 0, Display.getWidth(), Display.getHeight());
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GLU.gluPerspective(67F, WIDTH / HEIGHT, 0.001F, 1000F);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
    }

    public static void clearScreen(){
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glClearColor(1F, 1F, 1F, 1F);
    }

    public static void clearScreen(double r, double g, double b, double a){
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glClearColor((float)r, (float)g, (float)b, (float)a);
    }

    public static void clearScreen(int r, int g, int b, int a){
        float red = r / 255;
        float green = g / 255;
        float blue = b / 255;
        float alpha = a / 255;
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glClearColor(r, g, b, a);
    }

    public static void clearScreen(Color color){
        float r = color.getRed() / 255;
        float g = color.getGreen() / 255;
        float b = color.getBlue() / 255;
        float a = color.getAlpha() / 255;
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glClearColor(r, g, b, a);
    }

}
