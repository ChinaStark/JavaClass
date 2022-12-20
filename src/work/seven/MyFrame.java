package work.seven;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title)
    {
        super(title);

        //ContentPane
        JPanel root=new WordFlow("");
        this.setContentPane(root);
        root.setLayout(new BorderLayout());



    }

}
