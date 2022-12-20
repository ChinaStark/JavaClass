package GraphCode.ActEvent;

import Question.Qinterface.impl1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyClickListener implements ActionListener {
    private final numberAdd view;
    MyClickListener(numberAdd OuterView){
        this.view = OuterView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("关闭")){
            view.setVisible(false);
            System.exit(0);
        }
        view.i++;
        view.jButton.setText(String.valueOf(view.i));
    }
}
