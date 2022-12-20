package MyApplet;

import java.applet.Applet;
import java.awt.Image;
import java.awt.Graphics;
public class ImageDemo extends Applet {
  private Image im;
  public void init() {
    im = getImage(getCodeBase(),"images/angel1.jpg");
    System.out.println(getCodeBase().toString());
    }
  public void paint(Graphics g) {
    int w=im.getWidth(this);
    int h=im.getHeight(this);
    g.drawImage(im, 0, 0, this);
     g.drawImage(im, 100, 50, w/2,h/2,this);
      g.drawImage(im, 180, 0, 2*w,2*h,this);

  }
}
