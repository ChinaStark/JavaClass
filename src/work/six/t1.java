package work.six;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class t1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public t1(){
        prepareGUI();
    }
    public static void main(String[] args){
        t1  swingControlDemo = new t1();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Java Swing JTextArea示例");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new FlowLayout());
//        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

//        mainFrame.add(headerLabel);
//        mainFrame.add(controlPanel);
//        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
//        headerLabel.setText("Control in action: JTextArea");


        JTextArea commentTextArea = new JTextArea( 5,20);

        JScrollPane scrollPane = new JScrollPane(commentTextArea);
        mainFrame.add(scrollPane);
        mainFrame.setVisible(true);
    }
//更多请阅读：https://www.yiibai.com/swing/swing_jtextarea.html


}
