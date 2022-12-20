package MyApplet;

import java.applet.Applet;
import java.awt.*;
public class ImageDemo0 extends Applet {
  private Image im;
  public void init() {
    im = getImage(getCodeBase(),"images/angel1.jpg");
  }
  public void paint(Graphics g) {
    g.drawImage(im, 0, 0, this);
  }
}
