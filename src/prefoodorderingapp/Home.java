/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefoodorderingapp;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Vinu
 */
public class Home extends javax.swing.JFrame {
    
    
    public void AssignMenu(String role){
            if(role.equals("Customer"))
            {
                btnmaintance.setVisible(false);
                btnOrdering.setVisible(false);
                
                
            }
        }

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        
        //AssignMenu(String role);
        
        
        if ("Customer".equals(loginsession.UserType)){
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            btnchash.setVisible(false);
            btnmaintance.setVisible(false);
        }
        
        
        
        ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("164-1647148_transparent-food-clip-art-food-beverage-png.png")));
        
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        jLabel1.setIcon(i);
        
        
        ImageIcon image=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("folder_customer_91730.jpg")));
        
        Image imga=image.getImage();
        Image imgb=imga.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon x=new ImageIcon(imgb);
        jLabel2.setIcon(x);
        
        
        ImageIcon imageorder=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("download (3).png")));
        
        Image img3=imageorder.getImage();
        Image img4=img3.getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon y=new ImageIcon(img4);
        jLabel4.setIcon(y);
        
        
        ImageIcon imagemain=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("DocumentManagementIcon1-01.png")));
        
        Image img5=imagemain.getImage();
        Image img6=img5.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon z=new ImageIcon(img6);
        jLabel5.setIcon(z);
        
        
        ImageIcon imagepay=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("man-cashier-cash-register-supermarket-vector-illustration-145320934.jpg")));
        
        Image img7=imagepay.getImage();
        Image img8=img7.getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon b=new ImageIcon(img8);
        jLabel6.setIcon(b);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnmenu = new javax.swing.JButton();
        btnmaintance = new javax.swing.JButton();
        btnchash = new javax.swing.JButton();
        btnCustomerde = new javax.swing.JButton();
        btnOrdering = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(101, 198, 187));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(134, 226, 213));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel3.setBackground(new java.awt.Color(162, 222, 208));
        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 48)); // NOI18N
        jLabel3.setText("HOME PAGE....");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(642, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1240, 90);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 180, 230, 200);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 180, 270, 190);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(780, 170, 240, 200);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 470, 250, 200);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(610, 470, 270, 190);

        btnmenu.setBackground(new java.awt.Color(78, 205, 196));
        btnmenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmenu.setText("FOOD & Drinks");
        btnmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenuMouseClicked(evt);
            }
        });
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnmenu);
        btnmenu.setBounds(70, 390, 210, 60);

        btnmaintance.setBackground(new java.awt.Color(78, 205, 196));
        btnmaintance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmaintance.setText("Maintance");
        btnmaintance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmaintanceMouseClicked(evt);
            }
        });
        jPanel1.add(btnmaintance);
        btnmaintance.setBounds(300, 680, 130, 50);

        btnchash.setBackground(new java.awt.Color(78, 205, 196));
        btnchash.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnchash.setText("Chashier");
        btnchash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnchashMouseClicked(evt);
            }
        });
        jPanel1.add(btnchash);
        btnchash.setBounds(670, 680, 130, 50);

        btnCustomerde.setBackground(new java.awt.Color(78, 205, 196));
        btnCustomerde.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCustomerde.setText("User Details");
        btnCustomerde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerdeMouseClicked(evt);
            }
        });
        jPanel1.add(btnCustomerde);
        btnCustomerde.setBounds(430, 390, 210, 60);

        btnOrdering.setBackground(new java.awt.Color(78, 205, 196));
        btnOrdering.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOrdering.setText("Ordering Details");
        btnOrdering.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderingMouseClicked(evt);
            }
        });
        jPanel1.add(btnOrdering);
        btnOrdering.setBounds(820, 380, 190, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1242, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseClicked
        try {
            // TODO add your handling code here:
            Menu mm  = new Menu();
            mm.setVisible(true);
            mm.pack();
            mm.setLocationRelativeTo(null);
            mm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        



    }//GEN-LAST:event_btnmenuMouseClicked

    private void btnCustomerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerdeMouseClicked
        try {
            // TODO add your handling code here:
            CustomerDetails cd  = new CustomerDetails();
            cd.setVisible(true);
            cd.pack();
            cd.setLocationRelativeTo(null);
            cd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCustomerdeMouseClicked

    private void btnOrderingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderingMouseClicked
        // TODO add your handling code here:
        Ordering oo  = new Ordering();
        oo.setVisible(true);
        oo.pack();
        oo.setLocationRelativeTo(null);
        oo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnOrderingMouseClicked

    private void btnmaintanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmaintanceMouseClicked
        try {
            // TODO add your handling code here:
            ProductMaintance Mn  = new ProductMaintance();
            Mn.setVisible(true);
            Mn.pack();
            Mn.setLocationRelativeTo(null);
            Mn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception ex) {
            //Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmaintanceMouseClicked

    private void btnchashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnchashMouseClicked
        try {
            // TODO add your handling code here:
            Chashier ch = new Chashier();
            ch.setVisible(true);
            ch.pack();
            ch.setLocationRelativeTo(null);
            ch.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnchashMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerde;
    private javax.swing.JButton btnOrdering;
    private javax.swing.JButton btnchash;
    private javax.swing.JButton btnmaintance;
    private javax.swing.JButton btnmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
