
package techie;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ragha
 */
public class CongratsL1 extends javax.swing.JFrame {

   
    public CongratsL1() {
        initComponents();
        setTitle("Techie");
        setLocationRelativeTo(null);
        PointsTextField.setEditable(false);
        PointsTextField.setText(""+LogIn.pointCount);
        
    }

   
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
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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
        CongratsLabel.setText("End of challenges");
        getContentPane().add(CongratsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 210, 50));

        PassedLevelLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        PassedLevelLabel.setForeground(new java.awt.Color(39, 40, 59));
        PassedLevelLabel.setText("Well done if you solved them all.");
        getContentPane().add(PassedLevelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 210, 40));

        YouCollectedLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        YouCollectedLabel.setForeground(new java.awt.Color(39, 40, 59));
        YouCollectedLabel.setText("<html>If not, no worries<br>your victory awaits next time.</html>");
        getContentPane().add(YouCollectedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 200, 50));

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
        getContentPane().add(RankingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 154, 30));

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CongratsBackground.png"))); // NOI18N
        getContentPane().add(BackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 340, 600));

        setBounds(0, 0, 330, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void RankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingButtonActionPerformed
        try {
            // TODO add your handling code here:
            new ranking().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CongratsL1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RankingButtonActionPerformed

    private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        try {
            new levels().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CongratsL1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HomeLabelMouseClicked

    private void PointsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PointsTextFieldActionPerformed

    
    public static void main(String args[]) {
        
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
    private javax.swing.JLabel PassedLevelLabel;
    private javax.swing.JLabel PointsLabel;
    private javax.swing.JTextField PointsTextField;
    private javax.swing.JButton RankingButton;
    private javax.swing.JLabel YouCollectedLabel;
    // End of variables declaration//GEN-END:variables
}
