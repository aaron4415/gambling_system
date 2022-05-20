/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jockeyclub_system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author kingl
 */
public class CLoginAndPasswordSystem {
    JPanel userNamePanel;
    JPanel passwordPanel;
    JTextField textUserNameField = new  JTextField();
    JPasswordField passwd = new JPasswordField();
     int getusername;
   int getpassword;
   JFrame frame;
    

    CLoginAndPasswordSystem( JPanel userName, JPanel password, JFrame f) {
        userNamePanel = userName;
        passwordPanel = password;
        frame = f;
        
    }
    public JPanel usernameGUI(){
    
        userNamePanel.setBackground(Color.BLACK);
        JLabel userJLabel= new JLabel("UserName :");
        userJLabel.setFont(new Font("Serif", Font.PLAIN, 35));
        userJLabel.setForeground(Color.white);
        
        textUserNameField.setPreferredSize(new Dimension(700, 100));
        textUserNameField.setFont(new Font("Serif", Font.PLAIN, 50));
       textUserNameField.setBackground(Color.BLACK);
       textUserNameField.setForeground(Color.white);
       textUserNameField.addActionListener( checkAccAction());
        userNamePanel.add(userJLabel);
        userNamePanel.add(textUserNameField);
       
         
         
        return  userNamePanel;
        
}
public JPanel passwordGUI(){
    passwordPanel.setBackground(Color.BLACK);
        JLabel passwordJLabel= new JLabel("Password : ");
        passwordJLabel.setFont(new Font("Serif", Font.PLAIN, 35));
        passwordJLabel.setForeground(Color.white);
         passwd.setPreferredSize(new Dimension(700, 100));
        passwd.setFont(new Font("Serif", Font.PLAIN, 50));
        passwd.setEchoChar('*');
         passwd.setBackground(Color.BLACK);
       passwd.setForeground(Color.white);
       passwd.addActionListener(checkAccAction());
        passwordPanel.add(passwordJLabel);
        passwordPanel.add(passwd);
        
        
    return passwordPanel;
   


}
public boolean checkBlank(int num){
     if (num == 0){
         return false;
     }else{
         return true;
     }
    
    
}
public Action checkAccAction(){
        Action action = new AbstractAction()
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if (checkBlank(passwd.getPassword().length)==false){
            JOptionPane.showMessageDialog(null, "The password input is empty!", "Warnning Message", JOptionPane.ERROR_MESSAGE);
            getusername = 0;
            getpassword = 0;
        }else{
            getpassword = Integer.parseInt(String.valueOf(passwd.getPassword()));
        }
     if (checkBlank(textUserNameField.getText().length())==false){
          JOptionPane.showMessageDialog(null, "The user name input is empty!", "Warnning Message", JOptionPane.ERROR_MESSAGE);  
          getusername = 0;
            getpassword = 0;
        }else{
            getusername = Integer.parseInt(textUserNameField.getText());
        }   
     
    Clogin_database acc1 = new Clogin_database(getusername,getpassword);
    if(acc1.result()==true){
        frame.dispose();
        new CLoginPage(getusername);
    }else if(passwd.getPassword().length!=0&&textUserNameField.getText().length()!=0){
        JOptionPane.showMessageDialog(null, "No account found", "Warnning Message", JOptionPane.ERROR_MESSAGE);
    }
    }
};
       return action;
   }
}
