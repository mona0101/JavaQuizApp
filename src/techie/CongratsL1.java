/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package techie;

/**
 *
 * @author ragha
 */
public class CongratsL1 extends javax.swing.JFrame {

    /**
     * Creates new form Congrats
     */
    public CongratsL1() {
        initComponents();
        
        setTitle("Techie");
        setLocationRelativeTo(null);
        PointsTextField.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomeLabel = new javax.swing.JLabel();
        CogratsImageLabel = new javax.swing.JLabel();
        CongratsLabel = new javax.swing.JLabel();
        PassedLevelLabel = new javax.swing.JLabel();
        YouCollectedLabel = new javax.swing.JLabel();
        PointsTextField = new javax.swing.JTextField();
        PointsLabel = new javax.swing.JLabel();
        RankingButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        HomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLabelMouseClicked(evt);
            }
        });
        getContentPane().add(HomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 20));

        CogratsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/congrats.png"))); // NOI18N
        getContentPane().add(CogratsImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, 115));

        CongratsLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        CongratsLabel.setForeground(new java.awt.Color(39, 40, 59));
        CongratsLabel.setText("Congratulations");
        getContentPane().add(CongratsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 194, 180, 50));

        PassedLevelLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        PassedLevelLabel.setForeground(new java.awt.Color(39, 40, 59));
        PassedLevelLabel.setText("You have Passed This Level !");
        getContentPane().add(PassedLevelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 190, 40));

        YouCollectedLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        YouCollectedLabel.setForeground(new java.awt.Color(39, 40, 59));
        YouCollectedLabel.setText("You Collected");
        getContentPane().add(YouCollectedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, 40));

        PointsTextField.setBackground(new java.awt.Color(255, 254, 250));
        PointsTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 27)); // NOI18N
        PointsTextField.setForeground(new java.awt.Color(39, 40, 59));
        PointsTextField.setText("300");
        PointsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PointsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointsTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PointsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 60, 70));

        PointsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 27)); // NOI18N
        PointsLabel.setForeground(new java.awt.Color(39, 40, 59));
        PointsLabel.setText("Points");
        getContentPane().add(PointsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, 70));

        RankingButton.setBackground(new java.awt.Color(39, 40, 59));
        RankingButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        RankingButton.setForeground(new java.awt.Color(255, 255, 255));
        RankingButton.setText("Go to Ranking");
        RankingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RankingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 154, 30));

        NextButton.setBackground(new java.awt.Color(39, 40, 59));
        NextButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        NextButton.setForeground(new java.awt.Color(255, 255, 255));
        NextButton.setText("Go to Next Level");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 154, 30));

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CongratsBackground.png"))); // NOI18N
        getContentPane().add(BackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 360, 600));

        setBounds(0, 0, 330, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void PointsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PointsTextFieldActionPerformed

    private void RankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RankingButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextButtonActionPerformed

    private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Welcome().setVisible(true);
    }//GEN-LAST:event_HomeLabelMouseClicked

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
            java.util.logging.Logger.getLogger(CongratsL1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CongratsL1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CongratsL1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CongratsL1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CongratsL1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JLabel CogratsImageLabel;
    private javax.swing.JLabel CongratsLabel;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel PassedLevelLabel;
    private javax.swing.JLabel PointsLabel;
    private javax.swing.JTextField PointsTextField;
    private javax.swing.JButton RankingButton;
    private javax.swing.JLabel YouCollectedLabel;
    // End of variables declaration//GEN-END:variables
}
