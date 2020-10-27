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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinu
 */
public class SetProductTableValues {
                                
    
    
    Connection con = Connections.getConnection();
    int rows=0;
    int rowIndex=0;
    
    String MyQuery = "SELECT * FROM proudcts orders by ProductID";
    PreparedStatement pres;
   String[][] data;
    public String[][] Tabler(){
        try {
            pres = con.prepareStatement(MyQuery);
            ResultSet res =  pres.executeQuery();
            
            
            if(res.next())
            {
                res.last();
                rows=res.getRow();
                res.beforeFirst();
            }
            
            data = new String[rows][];
           
            
            return data;
            
            
            
            
        } catch (SQLException ex) {
            //Logger.getLogger(SetProductTableValues.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Can not Retrive Data");
        }
        //ResultSet res =  pres.executeQuery()
        return data;
    }
    
    
    
}
    

