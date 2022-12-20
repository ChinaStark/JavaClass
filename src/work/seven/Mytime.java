package work.seven;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mytime extends JFrame implements Runnable {
    Thread timeofme;
    JLabel text;
    Font font;
    public void setTimeofme(Thread thread){
        timeofme = thread;

    }
    Mytime(){
        setBounds(200,300,300,200);
        font = new Font("仿宋",Font.BOLD,50);
        text = new JLabel("");
        text.setFont(font);
        text.setForeground(Color.red);
        text.setBounds(10,10,200,100);
        setLayout(null);
        add(text);
        setVisible(true);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @Override
    public void run() {

        String hour,minute,second;

        int j = 0;
        while (j<1000){
            Calendar instance = Calendar.getInstance();
            hour = String.valueOf(instance.get(Calendar.HOUR));
            minute = String.valueOf(instance.get(Calendar.MINUTE));
            second = String.valueOf(instance.get(Calendar.SECOND));
            text.setText(hour+':'+minute+":"+second);
            System.out.println(hour+':'+minute+":"+second);
            validate();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            j++;
        }

    }

    public static void main(String[] args) {
        Mytime mytime = new Mytime();
        Thread thread = new Thread(mytime);
        mytime.setTimeofme(thread);
        thread.start();

    }


}
