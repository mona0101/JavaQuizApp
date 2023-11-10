
package techie;

public class Q3Level2 extends javax.swing.JFrame {
    
    
   
  
    
    public Q3Level2() {
        initComponents();
       
       
        
       //add radio buttons to group
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        HomeLabel = new javax.swing.JLabel();
        PointsImageLabel = new javax.swing.JLabel();
        PointsTextField = new javax.swing.JTextField();
        NextButton = new javax.swing.JButton();
        Level1Label = new javax.swing.JLabel();
        Q1Label = new javax.swing.JLabel();
        a4 = new javax.swing.JRadioButton();
        a3 = new javax.swing.JRadioButton();
        a1 = new javax.swing.JRadioButton();
        a2 = new javax.swing.JRadioButton();
        q2 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        PointsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointsTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PointsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 20, 20));

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

        Level1Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Level1Label.setForeground(new java.awt.Color(39, 40, 59));
        Level1Label.setText("Level 2");
        getContentPane().add(Level1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 60, -1));

        Q1Label.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Q1Label.setForeground(new java.awt.Color(39, 40, 59));
        Q1Label.setText("Q. what is the result of 1+2?");
        getContentPane().add(Q1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 220, -1));

        buttonGroup1.add(a4);
        a4.setText("jRadioButton1");
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        buttonGroup1.add(a3);
        a3.setText("jRadioButton1");
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        buttonGroup1.add(a1);
        a1.setText("jRadioButton1");
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        buttonGroup1.add(a2);
        a2.setText("jRadioButton1");
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/q3level2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        setBounds(0, 0, 330, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextButtonActionPerformed

    private void PointsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PointsTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Q3Level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q3Level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q3Level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q3Level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q3Level2().setVisible(true);
            }
        });
    }

 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel Level1Label;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel PointsImageLabel;
    private javax.swing.JTextField PointsTextField;
    private javax.swing.JLabel Q1Label;
    private javax.swing.JRadioButton a1;
    private javax.swing.JRadioButton a2;
    private javax.swing.JRadioButton a3;
    private javax.swing.JRadioButton a4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    // End of variables declaration//GEN-END:variables
}
