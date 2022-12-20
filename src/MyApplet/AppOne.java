package MyApplet;

import java.applet.Applet;
import java.awt.*;
import java.net.URL;


public class AppOne extends Applet {
//    Image i;
    public void init() {
        Graphics g = this.getGraphics();
        paint(g);
    }

    public void paint(Graphics g) {
        g.drawString("bh",20,20);
    }
}
