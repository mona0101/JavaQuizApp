/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package techie;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Welcome extends javax.swing.JFrame {

  
    
    
    public Welcome() {
        initComponents();
        
        setTitle("Techie");
        setLocationRelativeTo(null);
        
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
        LogoImageLabel = new javax.swing.JLabel();
        logoTextLabel = new javax.swing.JLabel();
        LogInButton = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(316, 593));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoNoText-06.png"))); // NOI18N
        jPanel1.add(LogoImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 184, 101));

        logoTextLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 34)); // NOI18N
        logoTextLabel.setForeground(new java.awt.Color(39, 40, 59));
        logoTextLabel.setText("Techie");
        jPanel1.add(logoTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 110, 60));

        LogInButton.setBackground(new java.awt.Color(39, 40, 59));
        LogInButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setText("Log in");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 154, 30));

        SignUpButton.setBackground(new java.awt.Color(39, 40, 59));
        SignUpButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(255, 255, 255));
        SignUpButton.setText("Sign up");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 154, 30));

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome.png"))); // NOI18N
        jPanel1.add(BackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 330, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogInButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JButton LogInButton;
    private javax.swing.JLabel LogoImageLabel;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoTextLabel;
    // End of variables declaration//GEN-END:variables
}
