/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jockeyclub_system;

/**
 *
 * @author kingl
 */
public class Elogin_database {
    int databaseusername;
    int databasepassword;
   
    public Elogin_database(int user,int password){
        databaseusername = user;
        databasepassword = password;
    }
    public boolean result(){
    return checkDusername(databaseusername, databasepassword);
}
   private boolean checkDusername(int user,int password){
   int[] accdataBase={123,123,224,224,553,553};  
   for (int i = 0;i < accdataBase.length-1;i=i+2){
       if (user == accdataBase[i]&&password==accdataBase[i+1]){
           return true;
       }
       
   }
       return false;
       
    
}
    
}
