/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package techie;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Q3Level1 extends javax.swing.JFrame {

    showMessageDialog op =new showMessageDialog("Wrong answer, you have scored zero points\nKeep going – success is on the way!\n"+
                   "Correct answer: a reference to the object");
     private ButtonGroup group=new ButtonGroup();
    
     
    public Q3Level1() {
        initComponents();
        setTitle("Techie");
        setLocationRelativeTo(null);
        PointsTextField.setEditable(false);
         //add radio buttons to group
         PointsTextField.setText("" + LogIn.pointCount);
    group.add(Choice1RadioButton);
    group.add(Choice2RadioButton);
    group.add(Choice3RadioButton);
    group.add(Choice4RadioButton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomeLabel = new javax.swing.JLabel();
        Level1Label = new javax.swing.JLabel();
        PointsTextField = new javax.swing.JTextField();
        PointsImageLabel = new javax.swing.JLabel();
        Q3Label = new javax.swing.JLabel();
        Choice1RadioButton = new javax.swing.JRadioButton();
        Choice2RadioButton = new javax.swing.JRadioButton();
        Choice3RadioButton = new javax.swing.JRadioButton();
        Choice4RadioButton = new javax.swing.JRadioButton();
        NextButton = new javax.swing.JButton();
        Num1Label = new javax.swing.JLabel();
        Num3Label1 = new javax.swing.JLabel();
        Num2Label2 = new javax.swing.JLabel();
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

        Level1Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Level1Label.setForeground(new java.awt.Color(39, 40, 59));
        Level1Label.setText("Level 1");
        getContentPane().add(Level1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 60, -1));

        PointsTextField.setBackground(new java.awt.Color(234, 220, 222));
        PointsTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        PointsTextField.setForeground(new java.awt.Color(39, 40, 59));
        PointsTextField.setText("00");
        PointsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(PointsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 30, 20));

        PointsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star2.png"))); // NOI18N
        getContentPane().add(PointsImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 20, -1));

        Q3Label.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Q3Label.setForeground(new java.awt.Color(39, 40, 59));
        Q3Label.setText("<html>Q3.When an object is passed<br> as an argument to a method,<br> this is actually passed ? </html>");
        getContentPane().add(Q3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 220, -1));

        Choice1RadioButton.setBackground(new java.awt.Color(255, 254, 250));
        Choice1RadioButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Choice1RadioButton.setForeground(new java.awt.Color(39, 40, 59));
        Choice1RadioButton.setText(" a copy of the object");
        Choice1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choice1RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Choice1RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        Choice2RadioButton.setBackground(new java.awt.Color(255, 254, 250));
        Choice2RadioButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Choice2RadioButton.setForeground(new java.awt.Color(39, 40, 59));
        Choice2RadioButton.setText(" the name of the object");
        Choice2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choice2RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Choice2RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        Choice3RadioButton.setBackground(new java.awt.Color(255, 254, 250));
        Choice3RadioButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Choice3RadioButton.setForeground(new java.awt.Color(39, 40, 59));
        Choice3RadioButton.setText("a reference to the object");
        Choice3RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choice3RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Choice3RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        Choice4RadioButton.setBackground(new java.awt.Color(255, 254, 250));
        Choice4RadioButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Choice4RadioButton.setForeground(new java.awt.Color(39, 40, 59));
        Choice4RadioButton.setText(" you cannot pass an object");
        Choice4RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choice4RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Choice4RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

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

        Num1Label.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Num1Label.setForeground(new java.awt.Color(255, 255, 255));
        Num1Label.setText("01");
        getContentPane().add(Num1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 76, 30, 30));

        Num3Label1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Num3Label1.setForeground(new java.awt.Color(255, 255, 255));
        Num3Label1.setText("03");
        getContentPane().add(Num3Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 30, 40));

        Num2Label2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Num2Label2.setForeground(new java.awt.Color(255, 255, 255));
        Num2Label2.setText("  02");
        getContentPane().add(Num2Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 76, 40, 30));

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Q3Level1.png"))); // NOI18N
        getContentPane().add(BackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 330, 600));

        setBounds(0, 0, 330, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        try {
            new levels().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Q3Level1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HomeLabelMouseClicked

    private void Choice1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choice1RadioButtonActionPerformed
        // TODO add your handling code here:
        Choice1RadioButton.setEnabled(false);
      Choice2RadioButton.setEnabled(false);
      Choice3RadioButton.setEnabled(false);
      Choice4RadioButton.setEnabled(false);
      
       op.setVisible(true);
        
    }//GEN-LAST:event_Choice1RadioButtonActionPerformed

    private void Choice2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choice2RadioButtonActionPerformed
        // TODO add your handling code here:
        Choice1RadioButton.setEnabled(false);
      Choice2RadioButton.setEnabled(false);
      Choice3RadioButton.setEnabled(false);
      Choice4RadioButton.setEnabled(false);
      
       op.setVisible(true);
    }//GEN-LAST:event_Choice2RadioButtonActionPerformed

    private void Choice4RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choice4RadioButtonActionPerformed
        // TODO add your handling code here:
        Choice1RadioButton.setEnabled(false);
      Choice2RadioButton.setEnabled(false);
      Choice3RadioButton.setEnabled(false);
      Choice4RadioButton.setEnabled(false);
      
       op.setVisible(true);
    }//GEN-LAST:event_Choice4RadioButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new  Q1Level2().setVisible(true);
    }//GEN-LAST:event_NextButtonActionPerformed

    private void Choice3RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choice3RadioButtonActionPerformed
        // TODO add your handling code here:
          
       Choice1RadioButton.setEnabled(false);
      Choice2RadioButton.setEnabled(false);
      Choice3RadioButton.setEnabled(false);
      Choice4RadioButton.setEnabled(false);
   
         
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
        
    }//GEN-LAST:event_Choice3RadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Q3Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q3Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q3Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q3Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q3Level1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JRadioButton Choice1RadioButton;
    private javax.swing.JRadioButton Choice2RadioButton;
    private javax.swing.JRadioButton Choice3RadioButton;
    private javax.swing.JRadioButton Choice4RadioButton;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel Level1Label;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel Num1Label;
    private javax.swing.JLabel Num2Label2;
    private javax.swing.JLabel Num3Label1;
    private javax.swing.JLabel PointsImageLabel;
    private javax.swing.JTextField PointsTextField;
    private javax.swing.JLabel Q3Label;
    // End of variables declaration//GEN-END:variables
}
