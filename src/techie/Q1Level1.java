
package techie;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Q1Level1 extends javax.swing.JFrame {
     showMessageDialog op = 
           new showMessageDialog("Wrong answer, you have scored zero points\nKeep going – success is on the way!\n"+
                   "Correct answer: Fn = Fn-1 + Fn-2 ");
    
   private ButtonGroup group=new ButtonGroup();
  
    
    public Q1Level1() {
        initComponents();
       
        setTitle("Techie");
        setLocationRelativeTo(null);
        PointsTextField.setEditable(false);
        PointsTextField.setText(""+ LogIn.pointCount);
        
       //add radio buttons to group
        
    group.add(Choice1RadioButton);
    group.add(Choice2RadioButton);
    group.add(Choice3RadioButton);
    group.add(Choice4RadioButton);
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
        PointsImageLabel = new javax.swing.JLabel();
        PointsTextField = new javax.swing.JTextField();
        NextButton = new javax.swing.JButton();
        Choice4RadioButton = new javax.swing.JRadioButton();
        Choice3RadioButton = new javax.swing.JRadioButton();
        Choice2RadioButton = new javax.swing.JRadioButton();
        Choice1RadioButton = new javax.swing.JRadioButton();
        Num1Label = new javax.swing.JLabel();
        Level1Label = new javax.swing.JLabel();
        Q1Label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        PointsTextField.setBackground(new java.awt.Color(255, 254, 250));
        PointsTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        PointsTextField.setForeground(new java.awt.Color(39, 40, 59));
        PointsTextField.setText("00");
        PointsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(PointsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 30, 20));

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

        Choice4RadioButton.setBackground(new java.awt.Color(255, 254, 250));
        Choice4RadioButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Choice4RadioButton.setForeground(new java.awt.Color(39, 40, 59));
        Choice4RadioButton.setText("Fn = Fn+1 - Fn+2");
        Choice4RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choice4RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Choice4RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        Choice3RadioButton.setBackground(new java.awt.Color(255, 254, 250));
        Choice3RadioButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Choice3RadioButton.setForeground(new java.awt.Color(39, 40, 59));
        Choice3RadioButton.setText("Fn = Fn+1 + Fn+2");
        Choice3RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choice3RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Choice3RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        Choice2RadioButton.setBackground(new java.awt.Color(255, 254, 250));
        Choice2RadioButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Choice2RadioButton.setForeground(new java.awt.Color(39, 40, 59));
        Choice2RadioButton.setText("Fn = Fn-1 - Fn-2 ");
        Choice2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choice2RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Choice2RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        Choice1RadioButton.setBackground(new java.awt.Color(255, 254, 250));
        Choice1RadioButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Choice1RadioButton.setForeground(new java.awt.Color(39, 40, 59));
        Choice1RadioButton.setText("Fn = Fn-1 + Fn-2 ");
        Choice1RadioButton.setActionCommand("Fn = Fn-1+ Fn-2 ");
        Choice1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choice1RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Choice1RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        Num1Label.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Num1Label.setForeground(new java.awt.Color(255, 255, 255));
        Num1Label.setText("01");
        getContentPane().add(Num1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 76, 30, 30));

        Level1Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Level1Label.setForeground(new java.awt.Color(39, 40, 59));
        Level1Label.setText("Level 1");
        getContentPane().add(Level1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 60, -1));

        Q1Label.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Q1Label.setForeground(new java.awt.Color(39, 40, 59));
        Q1Label.setText("<html>Q1.The Fibonacci Sequence <br> Formula is</html>");
        getContentPane().add(Q1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 220, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/L1Q1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 330, 600));

        setBounds(0, 0, 330, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void Choice1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choice1RadioButtonActionPerformed
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
       // this.setVisible(false);
        this.dispose();
        new Q2Level1().setVisible(true);
    }//GEN-LAST:event_NextButtonActionPerformed

    private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
         try {
             new levels().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(Q1Level1.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_HomeLabelMouseClicked

    private void Choice3RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choice3RadioButtonActionPerformed
        // TODO add your handling code here:
      Choice1RadioButton.setEnabled(false);
      Choice2RadioButton.setEnabled(false);
      Choice3RadioButton.setEnabled(false);
      Choice4RadioButton.setEnabled(false);
      
       op.setVisible(true);
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
            java.util.logging.Logger.getLogger(Q1Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q1Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q1Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q1Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q1Level1().setVisible(true);
            }
        });
    }

 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Choice1RadioButton;
    private javax.swing.JRadioButton Choice2RadioButton;
    private javax.swing.JRadioButton Choice3RadioButton;
    private javax.swing.JRadioButton Choice4RadioButton;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel Level1Label;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel Num1Label;
    private javax.swing.JLabel PointsImageLabel;
    private javax.swing.JTextField PointsTextField;
    private javax.swing.JLabel Q1Label;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
