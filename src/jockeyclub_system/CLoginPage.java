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
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author kingl
 */
public class CLoginPage {
    int Cuser;
    public CLoginPage(int user) {
        
          JFrame frame = new JFrame();
         frame.setLayout(new BorderLayout());
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           JPanel TopPanel = new JPanel(new GridLayout(1, 8));
          TopInfBar topInfBar = new TopInfBar(TopPanel);
        JPanel AccPanel = new JPanel(new GridLayout(8, 1)); 
        JPanel userNamePanel = new JPanel(new FlowLayout());
       
        
        JPanel passwordPanel = new JPanel(new FlowLayout());
       
    
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
        
           AccPanel.add(userNamePanel);
       AccPanel.add(passwordPanel);
       AccPanel.add( blankJPanel7);
        AccPanel.add( blankJPanel8);
      JPanel bottonPanel = new JPanel(new FlowLayout());
    
         int last3D[] = getlast3DofCID(Cuser);
     
      JLabel cJLabel= new JLabel();
       cJLabel.setText("Customer ID : "+"***"+String.valueOf(getlast3DofCID(Cuser))+"                 ");
         JLabel timeJLabel= new JLabel();
         ClockSystem t1 = new ClockSystem(timeJLabel);
        bottonPanel.add(cJLabel); 
         bottonPanel.add(t1.getClock());
          frame.add(topInfBar.setTopInfBar(), BorderLayout.NORTH);
          
          frame.add(AccPanel, BorderLayout.CENTER);
          frame.add(blankLeftJPanel, BorderLayout.LINE_START);
          frame.add(blankRightJPanel, BorderLayout.LINE_END);
          frame.add(bottonPanel, BorderLayout.PAGE_END);
        frame.setTitle("Customer Page" );  
         frame.setVisible(true);
         frame.setSize(1920, 1080);
     frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    public int[] getlast3DofCID(int CID){
        int[] temp= new int[3];
        int j = 0;
        int length = (int) (Math. log10(CID) + 1);
        for (int i = length;i > length - 3;i--){
            temp [j] = i;
            j++;
        }
       return temp;
    }
}
