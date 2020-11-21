/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefoodorderingapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static prefoodorderingapp.ProductMaintance.buildTableModel;

/**
 *
 * @author Vinu
 */
public class CustomerDetails extends javax.swing.JFrame {
    
    private Connection connect = Connections.getConnection();
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ResultSet rs = null;
    
    public void fillusertabelsrch(String uIDs) throws SQLException {
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = connect;
            Statement stmt = con.createStatement();  
            //ResultSet rs = stmt.executeQuery("select * from users where UserID='"+ uIDs +"'");
             if ("Customer".equals(loginsession.UserType)){
                 rs = stmt.executeQuery("select * from users where UserID='"+ loginsession.UserName +"'");
             } else {
                 rs = stmt.executeQuery("select * from users where UserName='"+ uIDs +"'");
             }
            
            userdetailtable.setModel(buildTableModel(rs));
            
            
        
        }catch(ClassNotFoundException ex){
              JOptionPane.showMessageDialog(this,ex );
        }
            
            
    }
    
    public void fillTable() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = connect;
            Statement stmt = con.createStatement();  
            ResultSet rs;
            if ("Customer".equals(loginsession.UserType)){
                 rs = stmt.executeQuery("select * from users where UserName='"+ loginsession.UserName +"'");
            } else {
                 rs = stmt.executeQuery("select * from users");
            }
            
            
            
            
            userdetailtable.setModel(buildTableModel(rs));
            
            
        } catch (ClassNotFoundException ex) {
            //
        }
    }
    
    public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}

    /**
     * Creates new form CustomerDetails
     */
    public CustomerDetails() throws SQLException {
        initComponents();
        
        fillTable();
        
         if ("Customer".equals(loginsession.UserType)){
            jLabel8.setVisible(false);
            jLabel6.setVisible(false);
            jLabel12.setVisible(false);
            jLabel7.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            btnsave.setVisible(false);
            btnupdate.setVisible(false);
            btndelete.setVisible(false);
            btnreset.setVisible(false);
            txtuid.setVisible(false);
            txtuname.setVisible(false);
            txtupw.setVisible(false);
            txtuemail.setVisible(false);
            txtutele.setVisible(false);
            comboutype.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userdetailtable = new javax.swing.JTable();
        txtuseridsrch = new javax.swing.JTextField();
        btnuidclr = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnuidserch = new javax.swing.JButton();
        txtutele = new javax.swing.JTextField();
        txtuid = new javax.swing.JTextField();
        txtuname = new javax.swing.JTextField();
        txtupw = new javax.swing.JTextField();
        txtuemail = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        comboutype = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 236, 241));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(25, 118, 210));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(162, 222, 208));
        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  User Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(638, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-10, 0, 1340, 100);

        btncancel.setBackground(new java.awt.Color(246, 36, 89));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("CANCEL");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel);
        btncancel.setBounds(1170, 700, 130, 50);

        userdetailtable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userdetailtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "User Name", "Password", "Email", "Telephone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userdetailtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userdetailtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userdetailtable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(510, 190, 790, 490);
        jPanel1.add(txtuseridsrch);
        txtuseridsrch.setBounds(180, 130, 810, 40);

        btnuidclr.setBackground(new java.awt.Color(25, 118, 210));
        btnuidclr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnuidclr.setForeground(new java.awt.Color(255, 255, 255));
        btnuidclr.setText("CLEAR");
        btnuidclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuidclrActionPerformed(evt);
            }
        });
        jPanel1.add(btnuidclr);
        btnuidclr.setBounds(1170, 130, 130, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("User Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 120, 130, 60);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("ID Number:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 230, 160, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("User Name:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 290, 160, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Password:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 350, 140, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("User Type:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 410, 160, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Email:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 500, 100, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Telephone No:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 560, 190, 30);

        btnuidserch.setBackground(new java.awt.Color(25, 118, 210));
        btnuidserch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnuidserch.setForeground(new java.awt.Color(255, 255, 255));
        btnuidserch.setText("SEARCH");
        btnuidserch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuidserchActionPerformed(evt);
            }
        });
        jPanel1.add(btnuidserch);
        btnuidserch.setBounds(1020, 130, 130, 40);

        txtutele.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtutele);
        txtutele.setBounds(170, 560, 320, 40);

        txtuid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtuid);
        txtuid.setBounds(170, 220, 320, 40);

        txtuname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtuname);
        txtuname.setBounds(170, 280, 320, 40);

        txtupw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtupw);
        txtupw.setBounds(170, 340, 320, 40);

        txtuemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtuemail);
        txtuemail.setBounds(170, 490, 320, 40);

        btnreset.setBackground(new java.awt.Color(25, 118, 210));
        btnreset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset);
        btnreset.setBounds(180, 690, 120, 50);

        btnsave.setBackground(new java.awt.Color(25, 118, 210));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave);
        btnsave.setBounds(180, 630, 120, 50);

        btnupdate.setBackground(new java.awt.Color(25, 118, 210));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate);
        btnupdate.setBounds(330, 630, 120, 50);

        btndelete.setBackground(new java.awt.Color(25, 118, 210));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete);
        btndelete.setBounds(330, 690, 120, 50);

        comboutype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboutype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Customer" }));
        jPanel1.add(comboutype);
        comboutype.setBounds(170, 410, 320, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1323, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnuidclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuidclrActionPerformed
        try {
            // TODO add your handling code here:
            txtuseridsrch.setText(null);
            fillTable();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnuidclrActionPerformed

    private void btnuidserchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuidserchActionPerformed

        
        
        String uIDs = txtuseridsrch.getText().toString();
        
        
       try {
            fillusertabelsrch(uIDs);
        } catch (Exception ex) {
            Logger.getLogger(Ordering.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        
        
    }//GEN-LAST:event_btnuidserchActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
          try{
            Connection con = Connections.getConnection();
            String MyQuery = "INSERT INTO users (UserID,UserName,Password,UserType,Email,TelephoneNo) VALUES (?,?,?,?,?,?)";
            PreparedStatement pres = con.prepareStatement(MyQuery);
            //ResultSet res =  pres.executeUpdate();
            pres.setString(1, txtuid.getText());
            pres.setString(2, txtuname.getText());
            pres.setString(3, txtupw.getText());
            pres.setString(4, comboutype.getSelectedItem().toString());
            pres.setString(5, txtuemail.getText());
            pres.setString(6, txtutele.getText());
            pres.execute();
            JOptionPane.showMessageDialog(this, "User record is Saved");

        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error");
            JOptionPane.showMessageDialog(this,ex );

        }
        try {
            fillTable();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        try{                                        
            // TODO add your handling code here:
            if (!txtuid.getText().isEmpty() || !txtuname.getText().isEmpty() || !txtupw.getText().isEmpty()){
                try{
                    Connection con = Connections.getConnection();
                    String MyQuery = "UPDATE users SET UserID =?,UserName=?,Password=?,UserType=?,Email=?,TelephoneNo=? WHERE UserID=?";
                    PreparedStatement pres = con.prepareStatement(MyQuery);
                    pres.setString(1, txtuid.getText());
                    pres.setString(2, txtuname.getText());
                    pres.setString(3, txtupw.getText());
                    pres.setString(4, comboutype.getSelectedItem().toString());
                    pres.setString(5, txtuemail.getText());
                    pres.setString(6, txtutele.getText());
                     pres.setString(7, txtuid.getText());
                    pres.execute();
                    JOptionPane.showMessageDialog(this, "User Recode is Updated");

                } catch (Exception ex) {
                    ///Logger.getLogger(Maintance.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Something Went Wrong..!");
                    JOptionPane.showMessageDialog(this,ex );
                }
        
            } else {
                    JOptionPane.showMessageDialog(this, "Fill the Relevent Fields");
                }
                    try {
                        fillTable();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerDetails.class.getName()).log(Level.SEVERE, null, ex);
                } 
                    }
        catch(Exception ex){}
                    
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        if (!txtuid.getText().isEmpty()){
            try{
                Connection con = Connections.getConnection();
                String MyQuery = "DELETE FROM users WHERE UserID =?";
                PreparedStatement pres = con.prepareStatement(MyQuery);
                pres.setString(1, txtuid.getText());
                pres.execute();
                JOptionPane.showMessageDialog(this, "User Recode is Deleted");

            } catch (Exception ex) {
                ///Logger.getLogger(Maintance.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Something Went Wrong..!");
            }
                try {
                    fillTable();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
        } else {
            JOptionPane.showMessageDialog(this, "Fill the Relevent Fields");
        }        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        clearfiels();
    }//GEN-LAST:event_btnresetActionPerformed

    private void userdetailtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userdetailtableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) userdetailtable.getModel();
        int selectedRowIndex = userdetailtable.getSelectedRow();
        
        txtuid.setText(tblModel.getValueAt(selectedRowIndex,0).toString());
        txtuname.setText(tblModel.getValueAt(selectedRowIndex,1).toString());
        txtupw.setText(tblModel.getValueAt(selectedRowIndex,2).toString());
        //comboptype.setModel(tblModel.getValueAt(selectedRowIndex,0).toString());
        String Category = tblModel.getValueAt(selectedRowIndex,3).toString();
        comboutype.setSelectedItem(Category);
        txtuemail.setText(tblModel.getValueAt(selectedRowIndex,4).toString());
        txtutele.setText(tblModel.getValueAt(selectedRowIndex,5).toString());
    }//GEN-LAST:event_userdetailtableMouseClicked

    
    
    
     public void clearfiels(){
        
        txtuid.setText(null);
        txtuname.setText(null);
        txtupw.setText(null);
        comboutype.setSelectedIndex(0);
        txtuemail.setText(null);
        txtutele.setText(null);
        
    }
     
     
     public void fillTablesrch() throws SQLException{
         
         
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CustomerDetails().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnuidclr;
    private javax.swing.JButton btnuidserch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> comboutype;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtuemail;
    private javax.swing.JTextField txtuid;
    private javax.swing.JTextField txtuname;
    private javax.swing.JTextField txtupw;
    private javax.swing.JTextField txtuseridsrch;
    private javax.swing.JTextField txtutele;
    private javax.swing.JTable userdetailtable;
    // End of variables declaration//GEN-END:variables
}
