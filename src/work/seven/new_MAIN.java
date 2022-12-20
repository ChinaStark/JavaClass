package work.seven;

import javax.swing.*;

public class new_MAIN extends JFrame {
    JPanel root;
    new_MAIN(){
        setSize(800, 300);
        this.setLayout(null);
        root=new WordFlow("     我正在欣赏月亮之上");
        root.setLayout(null);
        root.setBounds(0,10,800,500);
        add(root);
//        root.repaint();
//        root.repaint();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        // 显示窗口
        setVisible(true);


    }

    public static void main(String[] args) {
        MAIN m = new MAIN();
        while (true){
            m.root.repaint();
        }


    }

}
