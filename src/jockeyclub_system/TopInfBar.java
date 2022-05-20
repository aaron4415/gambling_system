/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jockeyclub_system;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author kingl
 */
public class TopInfBar {
JPanel TopPanel ;
    public TopInfBar(JPanel panel) {
        TopPanel = panel;
    }
    public JPanel setTopInfBar(){
        JButton topInfButton_1 = new JButton();
          JButton topInfButton_2 = new JButton();
          JButton topInfButton_3 = new JButton();
          JButton topInfButton_4 = new JButton();
          JButton topInfButton_5 = new JButton();
          JButton topInfButton_6 = new JButton();
          JButton topInfButton_7 = new JButton();
          JButton topInfButton_8 = new JButton();
         topInfButton_1.setText("Information 1");
        
          topInfButton_2.setText("Information 2");
           topInfButton_3.setText("Information 3");
            topInfButton_4.setText("Information 4");
             topInfButton_5.setText("Information 5");
              topInfButton_6.setText("Information 6");
               topInfButton_7.setText("Information 7");
               topInfButton_8.setText("Information 8");
             topInfButton_1.setPreferredSize(new Dimension(200, 75));
       topInfButton_1.setForeground(Color.white);
       topInfButton_2.setForeground(Color.white);
       topInfButton_3.setForeground(Color.white);
       topInfButton_4.setForeground(Color.white);
       topInfButton_5.setForeground(Color.white);
       topInfButton_6.setForeground(Color.white);
       topInfButton_7.setForeground(Color.white);
       topInfButton_8.setForeground(Color.white);
       
       
         topInfButton_1.setBackground(Color.black);
         topInfButton_2.setBackground(Color.black);
         topInfButton_3.setBackground(Color.black);
         topInfButton_4.setBackground(Color.black);
         topInfButton_5.setBackground(Color.black);
         topInfButton_6.setBackground(Color.black);
         topInfButton_7.setBackground(Color.black);
         topInfButton_8.setBackground(Color.black);
         
         
         TopPanel.add(topInfButton_1);
          TopPanel.add(topInfButton_2);
           TopPanel.add(topInfButton_3);
            TopPanel.add(topInfButton_4);
             TopPanel.add(topInfButton_5);
             TopPanel.add(topInfButton_6);
               TopPanel.add(topInfButton_7);
                TopPanel.add(topInfButton_8);
                return TopPanel;
    }
}
