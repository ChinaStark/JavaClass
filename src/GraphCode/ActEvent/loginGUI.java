package GraphCode.ActEvent;

import javax.swing.*;
import java.awt.*;

public class loginGUI extends JFrame {
    JLabel label,label1,label2;
    JButton btn,btn2;
    Box b1,b2,box,box2;
    ImageIcon imageIcon;
    JTextField jTextField;
    JPasswordField jPasswordField;





    loginGUI(){

        setLayout(null);
        setBounds(300,100,400,380);
        imageIcon = new ImageIcon("resource/img/logoNew.png");
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(332,80,Image.SCALE_DEFAULT));
        label = new JLabel(imageIcon);
        label.setBounds(25,25,332,80);
        add(label);
        label1 = new JLabel("用户名");
        label2 = new JLabel("密码");
        box = Box.createHorizontalBox();
        b1 = Box.createVerticalBox();
        b2 = Box.createVerticalBox();
        b1.add(label1);
        b1.add(label2);
        jTextField = new JTextField(10);
        jPasswordField = new JPasswordField(10);
        b2.add(jTextField);
        b2.add(jPasswordField);
        box.add(b1);
        box.setBounds(80,120,200,50);
        box.add(Box.createHorizontalStrut(10));
        box.add(b2);
        add(box);

        box2 = Box.createHorizontalBox();
        box2.add(Box.createHorizontalStrut(10));
        box2.setBounds(130,180,200,50);
        btn = new JButton("登陆");
        btn.addActionListener(new MyloginListener(this));

        btn2 = new JButton("注册");
        btn2.addActionListener(new MyloginListener(this));
        box2.add(btn);
        box2.add(btn2);
        add(box2);
        setVisible(true);



        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
