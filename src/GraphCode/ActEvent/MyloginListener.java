package GraphCode.ActEvent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MyloginListener implements ActionListener {
    private final loginGUI login_inner;
    String name = "Luv";
    String pwd = "123456789";
    MyloginListener(loginGUI login){
        this.login_inner = login;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(Objects.equals(e.getActionCommand(), "注册")){
            JOptionPane.showConfirmDialog(null,"未开放",null,JOptionPane.YES_NO_OPTION);
            return;
        }
        String inputname = login_inner.jTextField.getText();
        String inputpwd = login_inner.jPasswordField.getText();
        if (Objects.equals(name, inputname) && Objects.equals(pwd, inputpwd)){
            JOptionPane.showConfirmDialog(null,"success!!!","提示", JOptionPane.YES_NO_OPTION);
        }else {
            JOptionPane.showConfirmDialog(null,"wrong","提示",JOptionPane.YES_NO_OPTION);
//            System.out.println(inputname+inputpwd);
            login_inner.jTextField.setText("");
            login_inner.jPasswordField.setText("");
        }
    }
}
