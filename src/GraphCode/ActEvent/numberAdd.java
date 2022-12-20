package GraphCode.ActEvent;

import javax.swing.*;
import java.awt.*;

public class numberAdd extends JFrame {
    public int i = 1;
    JButton jButton;
    numberAdd(){
        setTitle("count");
        setBounds(400,200,300,200);
        setLayout(new FlowLayout());
        jButton = new JButton(String.valueOf(i));
        jButton.addActionListener(new MyClickListener(this));
        jButton.setBounds(20,30,50,50);
        add(jButton);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
