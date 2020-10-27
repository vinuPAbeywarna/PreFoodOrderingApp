/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefoodorderingapp;

/**
 *
 * @author Vinu
 */
public class OrderObj {
    public String UserID;
    public String ProductID;
    public int Qty = 1;
    public boolean Status = false;
    
    public void OrderObj(String uid, String pid, int qt){
        UserID = uid;
        ProductID = pid;
        Qty = qt;
    }
    
    
    
}
