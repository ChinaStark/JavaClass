package work.six;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame2 extends JFrame implements ActionListener{
    JButton bt1,bt2,bt3,bt4;
    JTextArea textArea;
    MyFrame2(String a){
        super();
        setName(a);
        setLayout(new FlowLayout());
        setBounds(300,200,300,200);
        bt1 = new JButton("确定");
        bt2 = new JButton("蓝色");
        bt3 = new JButton("黑色");
        bt4 = new JButton("清除");
        textArea = new JTextArea(3, 10);
        textArea.setFont(new Font("Serif",0,20));
        textArea.setForeground(Color.blue);
        JScrollPane jScrollPane = new JScrollPane(textArea);
        add(bt1);add(bt2);add(bt3);add(bt4);
        add(jScrollPane);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);


        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textArea.setText("你点击的是" + e.getActionCommand());
    }
}

public class Six_2 {
    public static void main(String[] args) {
        new MyFrame2("f2");
    }
}
