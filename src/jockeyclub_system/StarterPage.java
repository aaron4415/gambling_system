/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jockeyclub_system;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
/**
 *
 * @author kingl
 */
public class StarterPage extends JFrame implements ActionListener{
     
    
  
    
    JFrame frame = new JFrame();
    
   
    StarterPage(){
       
         
         frame.setLayout(new BorderLayout());
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           JPanel TopPanel = new JPanel(new GridLayout(1, 8));
          TopInfBar topInfBar = new TopInfBar(TopPanel);
          
        JPanel AccPanel = new JPanel(new GridLayout(8, 1)); 
        JPanel userNamePanel = new JPanel(new FlowLayout());
        
       
        
        JPanel passwordPanel = new JPanel(new FlowLayout());
        
        ELoginAndPasswordSystem eLoginAndPasswordSystem = new  ELoginAndPasswordSystem(userNamePanel,passwordPanel,frame);
         JPanel blankJPanel1 = new JPanel();
         blankJPanel1.setPreferredSize(new Dimension(500, 25));
         blankJPanel1.setBackground(Color.BLACK);
         
         JPanel blankJPanel2 = new JPanel();
         blankJPanel2.setPreferredSize(new Dimension(500, 25));
         blankJPanel2.setBackground(Color.BLACK);
         JPanel blankJPanel3 = new JPanel();
         blankJPanel3.setPreferredSize(new Dimension(500, 25));
         blankJPanel3.setBackground(Color.BLACK);
         JPanel blankJPanel4 = new JPanel();
         blankJPanel4.setPreferredSize(new Dimension(500, 25));
         blankJPanel4.setBackground(Color.BLACK);
         JPanel blankJPanel7 = new JPanel();
         blankJPanel7.setPreferredSize(new Dimension(500, 25));
         blankJPanel7.setBackground(Color.BLACK);
         
         
         JPanel blankJPanel8 = new JPanel();
         blankJPanel8.setPreferredSize(new Dimension(500, 25));
         blankJPanel8.setBackground(Color.BLACK);
        JPanel blankLeftJPanel = new JPanel();
        JPanel blankRightJPanel = new JPanel();
        
        blankRightJPanel.setBackground(Color.BLACK);
        blankLeftJPanel.setBackground(Color.BLACK);
        blankRightJPanel.setPreferredSize(new Dimension(500, 50));
        blankLeftJPanel.setPreferredSize(new Dimension(500, 50));
        
        AccPanel.add( blankJPanel1);
        AccPanel.add( blankJPanel2);
        AccPanel.add( blankJPanel3);
        AccPanel.add( blankJPanel4);
        
           AccPanel.add(eLoginAndPasswordSystem.usernameGUI());
       AccPanel.add(eLoginAndPasswordSystem.passwordGUI());
       AccPanel.add( blankJPanel7);
        AccPanel.add( blankJPanel8);
      JPanel bottonPanel = new JPanel(new FlowLayout());
    
         
     
      
         JLabel timeJLabel= new JLabel();
         ClockSystem t1 = new ClockSystem(timeJLabel);
         
         bottonPanel.add(t1.getClock());
         
          frame.add(topInfBar.setTopInfBar(), BorderLayout.NORTH);
          
          frame.add(AccPanel, BorderLayout.CENTER);
          frame.add(blankLeftJPanel, BorderLayout.LINE_START);
          frame.add(blankRightJPanel, BorderLayout.LINE_END);
          frame.add(bottonPanel, BorderLayout.PAGE_END);
        frame.setTitle("Hong Kong Jockeyclub bet system" );  
         frame.setVisible(true);
         frame.setSize(1920, 1080);
     frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
  
    



    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
      
}

