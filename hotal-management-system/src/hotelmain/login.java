package hotelmain;

import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class login extends javax.swing.JFrame {

    public login() throws NumberFormatException, ParseException {
        try {
            Authentication.fillList();
            Data.fillList();
            BookingData.fillList();
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFldMail = new javax.swing.JTextField();
        txtFldPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        checkBoxxShow = new javax.swing.JCheckBox();
        btnkayit = new javax.swing.JButton();
        txtMasej = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN SCREEN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, 57));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("User Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 179, 121, 47));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 260, 121, 39));
        getContentPane().add(txtFldMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 186, 223, 37));
        getContentPane().add(txtFldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 262, 223, 39));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setText("LOGİN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 139, 41));

        checkBoxxShow.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        checkBoxxShow.setText("Show ");
        checkBoxxShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxxShowActionPerformed(evt);
            }
        });
        getContentPane().add(checkBoxxShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 261, -1, 41));

        btnkayit.setText("Register");
        btnkayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkayitActionPerformed(evt);
            }
        });
        getContentPane().add(btnkayit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 486, -1, -1));

        txtMasej.setForeground(new java.awt.Color(255, 0, 102));
        getContentPane().add(txtMasej, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 460, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmain/front.PNG"))); // NOI18N
        jLabel4.setText(" ");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 500, 390));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmain/back.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkayitActionPerformed
        registeration rg = new registeration();
        rg.setVisible(true);
        this.setVisible(false);
        

    }//GEN-LAST:event_btnkayitActionPerformed
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      String userName = txtFldMail.getText();
        String password = txtFldPassword.getText();

       
        
        boolean iscorrect = Authentication.isAuthenticate(userName, password);
        if (iscorrect) {
            User user = Authentication.findUserWithUsername(userName);
            if (user != null && user.getIsAdmin()) {
                managementSystem ms = new managementSystem();
                ms.setVisible(true);
                this.setVisible(false);
            } else {

                mainActivity ma = new mainActivity(user.getUsername(), user.getEMail(), user.getGender());
                ma.setVisible(true);
                this.setVisible(false);
            }
        } else {
            txtMasej.setText("Username or Password is incorrect");
            txtFldMail.setText("");
            txtFldPassword.setText("");
            
            

        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void checkBoxxShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxxShowActionPerformed
        if (checkBoxxShow.isSelected()) {
            txtFldPassword.setEchoChar((char) 0);
        } else {
            txtFldPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_checkBoxxShowActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new login().setVisible(true);
                } catch (NumberFormatException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnkayit;
    private javax.swing.JCheckBox checkBoxxShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtFldMail;
    private javax.swing.JPasswordField txtFldPassword;
    private javax.swing.JLabel txtMasej;
    // End of variables declaration//GEN-END:variables
}
