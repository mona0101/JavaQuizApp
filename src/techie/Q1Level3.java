package techie;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q1Level3 extends javax.swing.JFrame {

    showMessageDialog op
            = new showMessageDialog("Wrong answer, you have scored zero pints.\n Keep going – success is on the way!");

    public Q1Level3() {
        initComponents();
        PointsTextField.setEditable(false);
        code.setEditable(false);
        jScrollPane1.setBorder(null);
         PointsTextField.setText("" + LogIn.pointCount);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        HomeLabel = new javax.swing.JLabel();
        PointsImageLabel = new javax.swing.JLabel();
        PointsTextField = new javax.swing.JTextField();
        Level3Label = new javax.swing.JLabel();
        Q1Label = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        enterLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        code = new javax.swing.JTextArea();
        ok = new javax.swing.JButton();
        NextButton2 = new javax.swing.JButton();
        backGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Techie");
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

        Level3Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Level3Label.setForeground(new java.awt.Color(39, 40, 59));
        Level3Label.setText("Level 3");
        getContentPane().add(Level3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 60, -1));

        Q1Label.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Q1Label.setForeground(new java.awt.Color(39, 40, 59));
        Q1Label.setText("Q1. What is The Output?");
        getContentPane().add(Q1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 220, -1));

        q1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        q1.setForeground(new java.awt.Color(255, 255, 255));
        q1.setText("01");
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 30, 50));

        enterLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        enterLabel.setText("Enter Your Answer:");
        getContentPane().add(enterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 140, 30));

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 90, 30));

        code.setBackground(new java.awt.Color(255, 254, 250));
        code.setColumns(20);
        code.setRows(5);
        code.setText("public class TrickyCode {\n    public static void main(String[] args) {\n        int x = 5;\n        int y = 10;\n\n        System.out.println(x + y + \" equals \" + x + y);\n    }\n}");
        code.setToolTipText("");
        code.setBorder(null);
        code.setCaretColor(new java.awt.Color(255, 255, 255));
        code.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        code.setDisabledTextColor(new java.awt.Color(255, 204, 204));
        jScrollPane1.setViewportView(code);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 270, 140));

        ok.setBackground(new java.awt.Color(39, 40, 59));
        ok.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ok.setForeground(new java.awt.Color(255, 255, 255));
        ok.setText("ok");
        ok.setActionCommand("");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 60, 20));

        NextButton2.setBackground(new java.awt.Color(39, 40, 59));
        NextButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        NextButton2.setForeground(new java.awt.Color(255, 255, 255));
        NextButton2.setText("Next");
        NextButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(NextButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 154, 30));

        backGroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/level3q1.png"))); // NOI18N
        backGroundLabel.setText("jLabel1");
        getContentPane().add(backGroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 590));

        setSize(new java.awt.Dimension(330, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseClicked
        try {
            // TODO add your handling code here:

            new levels().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Q1Level3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HomeLabelMouseClicked

    private void NextButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButton2ActionPerformed
        // TODO add your handling code here:
        new Q2Level3().setVisible(true);

    }//GEN-LAST:event_NextButton2ActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:

        jTextField1.setEnabled(false);
        ok.setEnabled(false);
        String input = jTextField1.getText().trim();
        if (input.equals("105 equals 105")) {

            op = new showMessageDialog("Congratulations!\n You've just scored 100 points!");
            op.setVisible(true);
            LogIn.pointCount +=100;
            PointsTextField.setText("" + LogIn.pointCount);
            // LogIn.users[LogIn.row][4]= ""+LogIn.pointCount;

        } else {

            op.setVisible(true);
        }

    }//GEN-LAST:event_okActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setEnabled(false);
        ok.setEnabled(false);
        String input = jTextField1.getText().trim();
        if (input.equals("105 equals 105")) {

            op = new showMessageDialog("Congratulations!\n You've just scored 100 points!");
            op.setVisible(true);
            LogIn.pointCount = +100;
            PointsTextField.setText("" + LogIn.pointCount);
            //LogIn.users[LogIn.row][4]= ""+LogIn.pointCou

        } else {

            op.setVisible(true);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q1Level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Q1Level3().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel Level3Label;
    private javax.swing.JButton NextButton2;
    private javax.swing.JLabel PointsImageLabel;
    private javax.swing.JTextField PointsTextField;
    private javax.swing.JLabel Q1Label;
    private javax.swing.JLabel backGroundLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea code;
    private javax.swing.JLabel enterLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton ok;
    private javax.swing.JLabel q1;
    // End of variables declaration//GEN-END:variables
}
