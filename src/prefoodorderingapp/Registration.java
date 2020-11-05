/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefoodorderingapp;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinu
 */
public class Registration extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement ps;

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        
        ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("reg.png")));
        
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        jLabel1.setIcon(i);
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
        jLabelloginpage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpw = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txttele = new javax.swing.JTextField();
        btncancel = new javax.swing.JButton();
        btnreg = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        combotype = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(101, 198, 187));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(134, 226, 213));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel3.setBackground(new java.awt.Color(162, 222, 208));
        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 48)); // NOI18N
        jLabel3.setText("REGISTRATION....");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(752, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-10, 0, 1350, 90);

        jLabelloginpage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelloginpage.setText("Click Here to Reditect to Login Page.......");
        jLabelloginpage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelloginpageMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelloginpage);
        jLabelloginpage.setBounds(670, 650, 440, 70);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("User Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 230, 130, 70);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Password:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 290, 110, 70);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("ID Number:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 170, 130, 70);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Email:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 440, 70, 70);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Telephone No:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 500, 160, 80);
        jPanel1.add(txtusername);
        txtusername.setBounds(240, 240, 370, 40);
        jPanel1.add(txtpw);
        txtpw.setBounds(240, 310, 370, 40);
        jPanel1.add(txtid);
        txtid.setBounds(240, 180, 370, 40);
        jPanel1.add(txtemail);
        txtemail.setBounds(240, 450, 370, 40);
        jPanel1.add(txttele);
        txttele.setBounds(240, 520, 370, 40);

        btncancel.setBackground(new java.awt.Color(246, 36, 89));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncancel.setText("CANCEL");
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });
        jPanel1.add(btncancel);
        btncancel.setBounds(440, 610, 130, 50);

        btnreg.setBackground(new java.awt.Color(78, 205, 196));
        btnreg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnreg.setText("REGISTER");
        btnreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregMouseClicked(evt);
            }
        });
        btnreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregActionPerformed(evt);
            }
        });
        jPanel1.add(btnreg);
        btnreg.setBounds(270, 610, 130, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("- Create Your New Account And Signin Our Page...");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 100, 570, 60);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(750, 210, 360, 380);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("User Type:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 360, 130, 70);

        combotype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combotype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Customer" }));
        combotype.setSelectedIndex(1);
        jPanel1.add(combotype);
        combotype.setBounds(240, 380, 370, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1321, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelloginpageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelloginpageMouseClicked
        // TODO add your handling code here:
        LoginPg lg = new LoginPg();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelloginpageMouseClicked

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelMouseClicked

    private void btnregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregMouseClicked
        // TODO add your handling code here:
      // JOptionPane.showMessageDialog(rootPane,"Your Registration is Successful", "Successful",1);
    }//GEN-LAST:event_btnregMouseClicked

    private void btnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregActionPerformed
        // TODO add your handling code here:
        if (!txtid.getText().isEmpty() || !txtpw.getText().isEmpty() || !txtemail.getText().isEmpty() || !txtusername.getText().isEmpty() || !txtpw.getText().isEmpty()){
        
            try{
                Connection con = Connections.getConnection();
                String MyQuery = "INSERT INTO users (UserID,UserName,Password,UserType,Email,TelephoneNo) VALUES (?,?,?,?,?,?)";
                PreparedStatement pres = con.prepareStatement(MyQuery);
                //ResultSet res =  pres.executeUpdate();
                pres.setString(1, txtid.getText());
                pres.setString(2, txtusername.getText());
                pres.setString(3, txtpw.getText());
                pres.setString(4, combotype.getSelectedItem().toString());
                pres.setString(5, txtemail.getText());
                pres.setString(6, txttele.getText());
                pres.execute();
                JOptionPane.showMessageDialog(this, "Your Registration is Successful");
            
            
            
            
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Error");
                JOptionPane.showMessageDialog(this,ex );

            }
         } else {
            JOptionPane.showMessageDialog(this, "Fill the Relevent Fields");
        }
        
        
        
    }//GEN-LAST:event_btnregActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnreg;
    private javax.swing.JComboBox<String> combotype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelloginpage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtpw;
    private javax.swing.JTextField txttele;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
