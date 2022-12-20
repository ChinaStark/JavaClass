package MyApplet;

import java.applet.AudioClip;
import java.applet.Applet;
import java.awt.*;
import java.net.URL;
public class Music1 extends  Applet{
	public void init(){
		play(getCodeBase(),"music/��ף.mid");
	}
	public void paint(Graphics g){
		g.drawString("������������ף",30,30);}
	
}