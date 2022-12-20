package work.seven;

import javax.swing.*;
import java.awt.*;

public class MAIN extends JFrame {
    JPanel root;
    MAIN(){
        setSize(800, 300);
        this.setLayout(null);
        root=new WordFlow("     我正在欣赏情人");
        root.setLayout(null);
        root.setBounds(0,10,800,500);
        add(root);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String[] args) {
        MAIN m = new MAIN();
        Thread thread = new Thread((Runnable) m.root);
        thread.setName("color");
        thread.start();
    }
}
