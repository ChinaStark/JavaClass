package delete;

import javax.swing.*;
import java.awt.*;

public class learn01 {
    public static void main(String[] args) {
        windowsBoxLayout windowsBoxLayout = new windowsBoxLayout();
        windowsBoxLayout.setBounds(1000,100,310,260);
    }
}

class windowsBoxLayout extends JFrame{
    Box boxH;
    Box boxVone,boxVtwo;
    void init(){
        boxH = Box.createHorizontalBox();
        boxVone = Box.createVerticalBox();
        boxVtwo = Box.createVerticalBox();
        boxVone.add(new JLabel("name"));
        boxVone.add(new JLabel("password"));
        boxVtwo.add(new JTextField(15));
        boxVtwo.add(new JTextField(10));

//        boxH.add(Box.createVerticalStrut(100));
        boxH.add(boxVone);
        boxH.add(boxVtwo);
        add(boxH);
    }
    public windowsBoxLayout(){
        setLayout(new FlowLayout());
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
