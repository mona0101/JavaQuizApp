/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package techie;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author abdul
 */
public class levels extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public levels() {
        initComponents();
      /* 
        ImageIcon backgroundIcon = new ImageIcon("src//images//levels.png");
        Image backGroundimg = backgroundIcon.getImage().getScaledInstance(levels.getWidth(), levels.getHeight(), Image.SCALE_SMOOTH);
        backgroundIcon = new ImageIcon(backGroundimg);
        levels.setIcon(backgroundIcon);
   
      */ 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        ranking = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        level1 = new javax.swing.JButton();
        level2 = new javax.swing.JButton();
        level3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Techie");
        setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        setLocationByPlatform(true);
        getContentPane().setLayout(null);

        welcomeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        welcomeLabel.setText("Welcome Mona");
        getContentPane().add(welcomeLabel);
        welcomeLabel.setBounds(10, 20, 110, 30);

        ranking.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ranking.setText("Ranking");
        ranking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rankingMouseClicked(evt);
            }
        });
        getContentPane().add(ranking);
        ranking.setBounds(250, 30, 50, 20);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("<html> Level up!<br> Conquer the first level and unlock the next.<br>  Are you ready for the challenge?  </html?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 220, 310, 110);

        level1.setBackground(new java.awt.Color(39, 40, 59));
        level1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        level1.setForeground(new java.awt.Color(255, 255, 255));
        level1.setText("Level 1");
        level1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level1ActionPerformed(evt);
            }
        });
        getContentPane().add(level1);
        level1.setBounds(80, 340, 154, 30);

        level2.setBackground(new java.awt.Color(39, 40, 59));
        level2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        level2.setForeground(new java.awt.Color(255, 255, 255));
        level2.setText("Level 2");
        level2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level2ActionPerformed(evt);
            }
        });
        getContentPane().add(level2);
        level2.setBounds(80, 390, 154, 30);

        level3.setBackground(new java.awt.Color(39, 40, 59));
        level3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        level3.setForeground(new java.awt.Color(255, 255, 255));
        level3.setText("Level 3");
        level3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level3ActionPerformed(evt);
            }
        });
        getContentPane().add(level3);
        level3.setBounds(80, 440, 154, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/histogrampng.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 320, 590);

        setSize(new java.awt.Dimension(330, 602));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rankingMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_rankingMouseClicked

    private void level1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level1ActionPerformed

    private void level2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level2ActionPerformed

    private void level3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level3ActionPerformed

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
            java.util.logging.Logger.getLogger(levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new levels().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton level1;
    private javax.swing.JButton level2;
    private javax.swing.JButton level3;
    private javax.swing.JLabel ranking;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
