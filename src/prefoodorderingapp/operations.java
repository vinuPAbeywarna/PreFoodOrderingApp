/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefoodorderingapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinu
 */
public class operations {
    public static boolean isLogin(String usertype, String username, String password, JFrame frame) throws SQLException{
        try{
            Connection con = Connections.getConnection();
            String MyQuery = "SELECT UserID, UserType, UserName FROM users WHERE UserType = '"+usertype+"' AND UserName = '"+username+"' AND Password = '"+password+"'";
            PreparedStatement pres = con.prepareStatement(MyQuery);
            ResultSet res =  pres.executeQuery();
            
            while(res.next()){
                loginsession.UserID = res.getInt("UserID");
                loginsession.UserType = res.getString("Usertype");
                loginsession.UserName = res.getString("UserName");
                
                return true;
                
            }
            
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(frame, "Database Error" + ex.getMessage());
        }
        
        
        return false;
        
    }
    
}
