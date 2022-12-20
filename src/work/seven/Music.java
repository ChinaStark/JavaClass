package work.seven;

import javax.swing.*;
import java.awt.*;

public class Music extends JFrame implements Runnable {
    Thread thread1,thread2,thread3,thread4,thread5,thread6;
    JLabel bt1,bt2,bt3,bt4,bt5,bt6;
    public void setTimeofme(Thread thread){
        thread1 = thread;

    }
    Music(){
        thread1 = new Thread();
        setLayout(null);
        setBounds(100,100,500,100);
        Font font = new Font("仿宋",Font.BOLD,30);

        bt1 = new JLabel("我");
        bt2 = new JLabel("正");
        bt3 = new JLabel("在");
        bt4 = new JLabel("欣");
        bt5 = new JLabel("赏");
        bt6 = new JLabel("a");
        bt1.setBounds(100,20,50,50);
        bt2.setBounds(150,20,50,50);
        bt3.setBounds(200,20,50,50);
        bt4.setBounds(250,20,50,50);
        bt5.setBounds(300,20,50,50);
        bt6.setBounds(350,20,50,50);
//        bt1.setBounds(20,80,20,20);
        bt1.setFont(font);
        bt2.setFont(font);
        bt3.setFont(font);
        bt4.setFont(font);
        bt5.setFont(font);
        bt6.setFont(font);

        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
        setVisible(true);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        Music music = new Music();
        Thread thread = new Thread(music);
        thread.start();
    }

    @Override
    public void run() {
//        bt1
//        bt2
//        bt3
//        bt4
//        bt5
//        bt6
    }
}
