package hotelmain;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbsfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author school
 */
public class mainActivity extends javax.swing.JFrame {

    private String Name;
    private String Email;
    private int Gender;

    /**
     * Creates new form mainActivity
     */
    public mainActivity() {

        initComponents();
    }

    public mainActivity(String Name, String Email, int Gender) {
        this.Name = Name;
        this.Email = Email;
        this.Gender = Gender;

        initComponents();

        txtName.setText(Name);
        txtEmail.setText(Email);
        cmbGender.setSelectedIndex(Gender);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbRoomtype = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAllocate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        dateIn = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        dateOut = new com.toedter.calendar.JDateChooser();
        btnReserve = new javax.swing.JButton();
        txtNumber = new javax.swing.JTextField();
        txtMesaj = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 49, 83, 34));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 90, 243, 30));

        cmbGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        cmbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenderActionPerformed(evt);
            }
        });
        getContentPane().add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 424, 90, 35));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Number Of Person");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 154, 145, 34));

        cmbRoomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non-AC" }));
        getContentPane().add(cmbRoomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 313, 112, 28));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Price");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 48, 83, 34));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 89, 143, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mobile Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 154, 128, 34));
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 201, 243, 30));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 312, 243, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 383, 83, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Check in Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 51, 108, 34));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 265, 83, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Room Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 265, 83, 34));

        btnAllocate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAllocate.setText("Room Allocation");
        btnAllocate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllocateActionPerformed(evt);
            }
        });
        getContentPane().add(btnAllocate, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 312, 202, 41));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 371, 202, 41));

        dateIn.setDateFormatString("dd.MM.yyyy");
        getContentPane().add(dateIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 92, 127, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Check Out Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 51, -1, 34));

        dateOut.setDateFormatString("dd.MM.yyyy");
        getContentPane().add(dateOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 92, 127, -1));

        btnReserve.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReserve.setText("Reserve");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });
        getContentPane().add(btnReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 481, 202, 41));
        getContentPane().add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 193, 112, 38));
        getContentPane().add(txtMesaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 481, 717, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmain/back-main3.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void cmbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenderActionPerformed

    private void btnAllocateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllocateActionPerformed
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date checkIn = null;
            Date checkOut = null;
        try {
            checkIn = sdf.parse(sdf.format(dateIn.getDate()));
            checkOut = sdf.parse(sdf.format(dateOut.getDate()));
        } catch (ParseException ex) {
            Logger.getLogger(mainActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (checkIn.before(checkOut)) {
            
            float cost = 0;
            try {
                cost = BookingData.CalcCost(dateIn.getDate(), dateOut.getDate(), Integer.valueOf(txtNumber.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(mainActivity.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (cost == 0) {
                txtMesaj.setText("Room is not found!!");
            }
            txtPrice.setText(String.valueOf(cost));
        } else {
            txtMesaj.setText("Pleas can you choose correct Date.");
        }
    }//GEN-LAST:event_btnAllocateActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed

    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date checkIn = null;
            Date checkOut = null;
        try {
            checkIn = sdf.parse(sdf.format(dateIn.getDate()));
            checkOut = sdf.parse(sdf.format(dateOut.getDate()));
        } catch (ParseException ex) {
            Logger.getLogger(mainActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (checkIn.before(checkOut)) {
        
        try {
            if (BookingData.CalcCost(dateIn.getDate(), dateOut.getDate(), Integer.valueOf(txtNumber.getText())) != (float) 0) {
                try {
                    Booking b = BookingData.areYouSure(dateIn.getDate(), dateOut.getDate(), Integer.valueOf(txtNumber.getText()), txtName.getText());
                    AreYouSure ays = new AreYouSure(b);
                    ays.setVisible(true);
                    this.setVisible(false);
                } catch (ParseException ex) {
                    Logger.getLogger(mainActivity.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(mainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                txtMesaj.setText("Room is not found!!");
            }
        } catch (ParseException ex) {
            Logger.getLogger(mainActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else {
            txtMesaj.setText("Pleas can you choose correct Date.");
        }
    }//GEN-LAST:event_btnReserveActionPerformed

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
            java.util.logging.Logger.getLogger(mainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllocate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnReserve;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbRoomtype;
    private com.toedter.calendar.JDateChooser dateIn;
    private com.toedter.calendar.JDateChooser dateOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtMesaj;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}