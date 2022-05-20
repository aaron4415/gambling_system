/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jockeyclub_system;

import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author kingl
 */
public class ClockSystem {
JLabel timeJLabel;
    public ClockSystem(JLabel timeJLabel1) {
        timeJLabel = timeJLabel1;
    }
    public JLabel getClock(){
        Thread clock = new Thread(){
        public void run(){
            try {
                for(;;){
                    Calendar calendar = new GregorianCalendar();
           int day=calendar.get(Calendar.DAY_OF_MONTH);
           int month=calendar.get(Calendar.MONTH);
           int year=calendar.get(Calendar.YEAR);
           int second=calendar.get(Calendar.SECOND);
           int min=calendar.get(Calendar.MINUTE);
           int h=calendar.get(Calendar.HOUR);
           timeJLabel.setText("Time   "+h+":"+min+":"+second);
                sleep(1000);
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(StarterPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
              
           clock.start();
          return timeJLabel;
    }
    
}
