/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefoodorderingapp;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vinu
 */
public class Connections {
    static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/prefoodorderdb","root","");
            
        }catch(Exception ex){
            System.out.println(""+ex);
            
        }
        return con;
    }
    
    
    
}
