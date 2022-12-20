package work.six;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class MyFrame3 extends JFrame{
    MyFrame3(String a){
        super();
        setName(a);
//        setLayout(null);
//        setIconImage();
        setVisible(true);

        setBounds(300,200,300,200);
        setForeground(Color.red);
        add(new JButton("南"), BorderLayout.SOUTH);
        add(new JButton("北"), BorderLayout.NORTH);
        add(new JButton("中心"), BorderLayout.CENTER);
        add(new JButton("东"), BorderLayout.EAST);
        add(new JButton("西"), BorderLayout.WEST);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

public class Six_3 {
    public static void main(String[] args) {
        new MyFrame3("f3");
    }
}
