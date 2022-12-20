package work.seven;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class WordFlow extends JPanel implements Runnable{
    public char[]chars;
    public Random rd;
    WordFlow(String a){
        rd = new Random();
        this.chars = a.toCharArray();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(Color.red);
        Font font = new Font("仿宋",Font.BOLD,30);
        g2.setFont(font);

//        g.setPaintMode(Color.red);
        for(int i =0;i<chars.length;i++){
            int R = rd.nextInt(256);
            int G = rd.nextInt(256);
            int B = rd.nextInt(256);
            g2.setColor(new Color(R,G,B));
            g2.drawString(String.valueOf(chars[i]),(i+1)*50,30);

        }
        char temp = chars[chars.length-1];
        System.arraycopy(chars, 0, chars, 1, chars.length - 2 + 1);
        chars[0] = temp;






    }

    @Override
    public void run() {
        try {
            URL cb;
            File f = new File("D:\\奇点\\Music\\Alarm01.mp3"); // 引号里面的是音乐文件所在的路径
            cb = f.toURL();
            AudioClip aau;
            aau = Applet.newAudioClip(cb);

            aau.play();
            aau.loop();//循环播放
            System.out.println("可以播放");
            //单曲 aau.stop()停止播放

        } catch (MalformedURLException e) {

            e.printStackTrace();
        }
        for (int i = 0;i<20;i++){
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
