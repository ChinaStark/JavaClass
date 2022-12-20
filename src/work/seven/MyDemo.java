package work.seven;

import javax.swing.*;

public class MyDemo {
    private static void createGUI()
    {
        // JFrame指一个窗口，构造方法的参数为窗口标题
        JFrame frame = new MyFrame("Swing Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口的其他参数，如窗口大小
        frame.setSize(500, 300);

        // 显示窗口
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                createGUI();
            }
        });

    }

}
