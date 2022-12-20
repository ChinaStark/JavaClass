package Mythread.example;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class WindowTyped extends JFrame implements KeyListener,Runnable {
   JTextField inputLetter;
   Thread giveLetter;       //���������ĸ
   JLabel showLetter,showScore;
   int sleepTime,score;
   Color c;
   WindowTyped() {
      setLayout(new FlowLayout());
      giveLetter=new Thread(this);
      inputLetter=new JTextField(6);
      showLetter =new JLabel(" ",JLabel.CENTER);
      showScore  = new JLabel("分数：");
      showLetter.setFont(new Font("Arial",Font.BOLD,22));
      add(new JLabel("显示字母"));
      add(showLetter);
      add(new JLabel("输入所显示的字母(回车)"));
      add(inputLetter); 
      add(showScore);
      inputLetter.addKeyListener(this);
      setBounds(100,100,400,280);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      giveLetter.start();    //��AWT-Windows�߳�������giveLetter�߳�
   }
   public void run() {
      char c ='a';
      while(true) {
         showLetter.setText(""+c+" ");
         validate();
         Random r = new Random();
         int i = r.nextInt(26)+97;
         c = (char)(i);
         try{ Thread.sleep(sleepTime);
         } 
         catch(InterruptedException e){}
      }
   }
   public void setSleepTime(int n){
      sleepTime = n;
   }


   @Override
   public void keyTyped(KeyEvent e) {

   }

   @Override
   public void keyPressed(KeyEvent e) {
      String s = showLetter.getText().trim();
      char keyChar = e.getKeyChar();
      String s1 =String.valueOf(keyChar);
      if(s1.equals(s)) {
         score++;
         showScore.setText("得分"+score);
         inputLetter.setText("");
         validate();
         giveLetter.interrupt();
      }
      inputLetter.setText("");
      validate();
   }

   @Override
   public void keyReleased(KeyEvent e) {

   }
}
