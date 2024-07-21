
package techie;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class levels extends javax.swing.JFrame {

     
    
    public levels() throws FileNotFoundException, IOException {
        initComponents();
     
          
      welcomeLabel.setText("Welocme "+LogIn.users[LogIn.row][1]);
  
      
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        ranking = new javax.swing.JLabel();
        discriptionLabel = new javax.swing.JLabel();
        level1 = new javax.swing.JButton();
        level2 = new javax.swing.JButton();
        level3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backGroundLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Techie");
        setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(null);

        welcomeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        welcomeLabel.setText("Welcome");
        getContentPane().add(welcomeLabel);
        welcomeLabel.setBounds(10, 20, 180, 30);

        ranking.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ranking.setText("Ranking");
        ranking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rankingMouseClicked(evt);
            }
        });
        getContentPane().add(ranking);
        ranking.setBounds(250, 20, 60, 30);

        discriptionLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        discriptionLabel.setText("<html>Choose any level and go for it!<br>Zero points if you can't<br> crack the challenge,<br>but keep that enthusiasm up!  </html>\n\n\n");
        getContentPane().add(discriptionLabel);
        discriptionLabel.setBounds(60, 210, 220, 110);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/v.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 90, 240, 130);

        backGroundLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome.png"))); // NOI18N
        getContentPane().add(backGroundLable);
        backGroundLable.setBounds(0, 0, 320, 590);

        setSize(new java.awt.Dimension(330, 602));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rankingMouseClicked
     
        this.setVisible(false);
        try {
            // TODO add your handling code here:
            new ranking().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(levels.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_rankingMouseClicked

    private void level1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level1ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        new Q1Level1().setVisible(true);
    }//GEN-LAST:event_level1ActionPerformed

    private void level2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level2ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
         new Q1Level2().setVisible(true);
         
        
    }//GEN-LAST:event_level2ActionPerformed

    private void level3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level3ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
         new Q1Level3().setVisible(true);
    }//GEN-LAST:event_level3ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new levels().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(levels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGroundLable;
    private javax.swing.JLabel discriptionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton level1;
    private javax.swing.JButton level2;
    private javax.swing.JButton level3;
    private javax.swing.JLabel ranking;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
