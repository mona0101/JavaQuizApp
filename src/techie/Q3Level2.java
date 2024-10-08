
package techie;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q3Level2 extends javax.swing.JFrame {
    
    showMessageDialog op =new showMessageDialog("Wrong answer, you have scored zero points\nKeep going – success is on the way!\n"+
                   "Correct answer: non-static");
    
    public Q3Level2() {
        initComponents();
        PointsTextField.setEditable(false);
       PointsTextField.setText(""+LogIn.pointCount);
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        HomeLabel = new javax.swing.JLabel();
        PointsImageLabel = new javax.swing.JLabel();
        PointsTextField = new javax.swing.JTextField();
        NextButton = new javax.swing.JButton();
        Level2Label = new javax.swing.JLabel();
        Q3Label = new javax.swing.JLabel();
        a4 = new javax.swing.JRadioButton();
        a3 = new javax.swing.JRadioButton();
        a1 = new javax.swing.JRadioButton();
        a2 = new javax.swing.JRadioButton();
        q2 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        backGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Techie");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        HomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLabelMouseClicked(evt);
            }
        });
        getContentPane().add(HomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 20));

        PointsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star2.png"))); // NOI18N
        getContentPane().add(PointsImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 20, -1));

        PointsTextField.setEditable(false);
        PointsTextField.setBackground(new java.awt.Color(255, 254, 250));
        PointsTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        PointsTextField.setForeground(new java.awt.Color(39, 40, 59));
        PointsTextField.setText("00");
        PointsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(PointsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 40, 20));

        NextButton.setBackground(new java.awt.Color(39, 40, 59));
        NextButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        NextButton.setForeground(new java.awt.Color(255, 255, 255));
        NextButton.setText("Next");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 154, 30));

        Level2Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Level2Label.setForeground(new java.awt.Color(39, 40, 59));
        Level2Label.setText("Level 2");
        getContentPane().add(Level2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 60, -1));

        Q3Label.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        Q3Label.setForeground(new java.awt.Color(39, 40, 59));
        Q3Label.setText("<html>  Q3.This type of method <br>cannot access any non-static <br>member variables in its own class.");
        getContentPane().add(Q3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 220, 70));

        a4.setBackground(new java.awt.Color(255, 254, 250));
        buttonGroup1.add(a4);
        a4.setText("non-static");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        a3.setBackground(new java.awt.Color(255, 254, 250));
        buttonGroup1.add(a3);
        a3.setText("static");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        a1.setBackground(new java.awt.Color(255, 254, 250));
        buttonGroup1.add(a1);
        a1.setText(" instance");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        a2.setBackground(new java.awt.Color(255, 254, 250));
        buttonGroup1.add(a2);
        a2.setText("void");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        q2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        q2.setForeground(new java.awt.Color(255, 255, 255));
        q2.setText("03");
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 40, 60));

        q1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        q1.setForeground(new java.awt.Color(255, 255, 255));
        q1.setText("01");
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 30, 40));

        q3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        q3.setForeground(new java.awt.Color(255, 255, 255));
        q3.setText("02");
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 40, 60));

        backGroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/level2Q1.png"))); // NOI18N
        getContentPane().add(backGroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        setSize(new java.awt.Dimension(330, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
         new Q1Level3().setVisible(true);
    }//GEN-LAST:event_NextButtonActionPerformed

    private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        try {
            new levels().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Q3Level2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HomeLabelMouseClicked

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
       a3.setEnabled(false);
 a4.setEnabled(false);
 a1.setEnabled(false);
 a2.setEnabled(false);
        op.setVisible(true);
    }//GEN-LAST:event_a2ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
         a3.setEnabled(false);
 a4.setEnabled(false);
 a1.setEnabled(false);
 a2.setEnabled(false);
        op.setVisible(true);
    }//GEN-LAST:event_a1ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
         a3.setEnabled(false);
 a4.setEnabled(false);
 a1.setEnabled(false);
 a2.setEnabled(false);
        op.setVisible(true);
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        
        a3.setEnabled(false);
 a4.setEnabled(false);
 a1.setEnabled(false);
 a2.setEnabled(false);
 a3.setEnabled(false); a4.setEnabled(false);a1.setEnabled(false);a2.setEnabled(false);
      op = new showMessageDialog("Congratulations!\n You've just scored 100 points!");
        op.setVisible(true);
         LogIn.pointCount +=100;
       
     
     if(LogIn.row !=-1){   
     LogIn.users[LogIn.row][4]= ""+LogIn.pointCount ;
           try { 
               Techie.SavingNewDataToFile() ;
           } catch (FileNotFoundException ex) {
               Logger.getLogger(Q1Level1.class.getName()).log(Level.SEVERE, null, ex);
           }
      }
        PointsTextField.setText("" + LogIn.pointCount);

        op.setVisible(true);
        
    }//GEN-LAST:event_a4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q3Level2().setVisible(true);
            }
        });
    }

 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel Level2Label;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel PointsImageLabel;
    private javax.swing.JTextField PointsTextField;
    private javax.swing.JLabel Q3Label;
    private javax.swing.JRadioButton a1;
    private javax.swing.JRadioButton a2;
    private javax.swing.JRadioButton a3;
    private javax.swing.JRadioButton a4;
    private javax.swing.JLabel backGroundLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    // End of variables declaration//GEN-END:variables
}
