/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefoodorderingapp;

import javax.swing.JFrame;

/**
 *
 * @author Vinu
 */
public class logout {
    public static void logout(JFrame context, LoginPg loginScreen){
        loginsession.isLoggedIn = false;
        context.setVisible(false);
        loginScreen.setVisible(true);
      
    }
             
}

