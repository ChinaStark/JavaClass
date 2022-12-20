package work.six;

import javax.swing.*;
import java.awt.*;

class MyFramae_1 extends JFrame{
    MyFramae_1(String a){
        super();
        setName(a);
        setLayout(new GridLayout(2,3));
        setBounds(300,200,300,200);
        for (int i = 0; i < 6; i++) {
            add(new JButton(String.valueOf(i)));
        }
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
public class Six_1 {
    public static void main(String[] args) {
        new MyFramae_1("f1");
    }
}
