/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;

/**
 *
 * @author MSI GL65
 */
public class ViewManager {
    
     public static LogInDashbord login;
   
    
    
    private ViewManager(){   
    }
    
    public static void openRegisterPage() throws IOException{
        if (login == null) {
            login = new LogInDashbord();
            login.show();
        } else {
            login.show();
        }
        
    }
    public static void closeRegisterPage(){
        if(login != null)
            login.close();
    }
    
}
