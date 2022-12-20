package MyApplet;


import java.awt.*;

import javax.swing.*;

import java.awt.Graphics;
public class JImageDemo extends JFrame{
  private Image im;
  public JImageDemo() {
	 setSize(600,800);
	 Container con=this.getContentPane();
	 con.setBackground(Color.LIGHT_GRAY);
    im = new ImageIcon("res/image/angel1.jpg").getImage();
    setVisible(true);
    }
  public void paint(Graphics g) {
	  super.paint(g);
    int w=im.getWidth(this);
    int h=im.getHeight(this);
    g.drawImage(im, 0, 0, this);
     g.drawImage(im, 100, 50, w/2,h/2,this);
      g.drawImage(im, 180, 0, 2*w,2*h,this);
  }
  public static void main(String args[]){
	  new JImageDemo();
  }
}
