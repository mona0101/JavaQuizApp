
package techie;

import java.io.FileNotFoundException;
import java.io.IOException;        
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q2Level3 extends javax.swing.JFrame {
    
    showMessageDialog op
            = new showMessageDialog("Wrong answer, you have scored zero points\nKeep going – success is on the way!\n"+
                   "Correct answer: 0 0");
    
    public Q2Level3() {
        initComponents();
        PointsTextField.setEditable(false);
      code.setEditable(false);
       PointsTextField.setText("" + LogIn.pointCount);
    
     jScrollPane1.setBorder(null);
      
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
        Level3Label = new javax.swing.JLabel();
        Q2Label = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        code = new javax.swing.JTextArea();
        enterLabel = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        backgroundLabel = new javax.swing.JLabel();

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

        PointsTextField.setBackground(new java.awt.Color(234, 220, 222));
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
        getContentPane().add(NextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 154, 30));

        Level3Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Level3Label.setForeground(new java.awt.Color(39, 40, 59));
        Level3Label.setText("Level 3");
        getContentPane().add(Level3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 60, -1));

        Q2Label.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Q2Label.setForeground(new java.awt.Color(39, 40, 59));
        Q2Label.setText("Q2.What is The Output?");
        getContentPane().add(Q2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 220, -1));

        q1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        q1.setForeground(new java.awt.Color(255, 255, 255));
        q1.setText("01");
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 30, 40));

        q3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        q3.setForeground(new java.awt.Color(255, 255, 255));
        q3.setText("02");
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 40, 60));

        code.setBackground(new java.awt.Color(255, 254, 250));
        code.setColumns(20);
        code.setForeground(new java.awt.Color(39, 40, 59));
        code.setRows(5);
        code.setText("class Test {\n    protected int x, y;\n}\n \nclass Main {\n    public static void main(String args[]) {\n        Test t = new Test();\n        System.out.println(t.x + \" \" + t.y);\n    }\n}");
        code.setToolTipText("");
        code.setBorder(null);
        code.setCaretColor(new java.awt.Color(255, 255, 255));
        code.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        code.setDisabledTextColor(new java.awt.Color(255, 204, 204));
        jScrollPane1.setViewportView(code);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 230, 170));

        enterLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        enterLabel.setForeground(new java.awt.Color(39, 40, 59));
        enterLabel.setText("Enter Your Answer:");
        getContentPane().add(enterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, 30));

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
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 60, 20));

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 90, 30));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/level3q2.png"))); // NOI18N
        backgroundLabel.setText(" What is The Output?");
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        setSize(new java.awt.Dimension(330, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        try {
            new levels().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Q2Level3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HomeLabelMouseClicked

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:

        jTextField1.setEnabled(false);
        ok.setEnabled(false);
        String input = jTextField1.getText().trim();
        if (input.equals("0 0")) {

            op = new showMessageDialog("Congratulations!\n You've just scored 100 points!");
            op.setVisible(true);
              LogIn.pointCount +=100;
            PointsTextField.setText("" + LogIn.pointCount);
   
     if(LogIn.row !=-1){   
     LogIn.users[LogIn.row][4]= ""+LogIn.pointCount ;
           try { 
               Techie.SavingNewDataToFile() ;
           } catch (FileNotFoundException ex) {
               Logger.getLogger(Q1Level1.class.getName()).log(Level.SEVERE, null, ex);
           }
      }
   

        } else {

            op.setVisible(true);
        }
    }//GEN-LAST:event_okActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setEnabled(false);
        ok.setEnabled(false);
        String input = jTextField1.getText().trim();
        if (input.equals("0 0")) {

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
           
        } else {

            op.setVisible(true);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Q3Level3().setVisible(true);
    }//GEN-LAST:event_NextButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q2Level3().setVisible(true);
            }
        });
    }

 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel Level3Label;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel PointsImageLabel;
    private javax.swing.JTextField PointsTextField;
    private javax.swing.JLabel Q2Label;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea code;
    private javax.swing.JLabel enterLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton ok;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q3;
    // End of variables declaration//GEN-END:variables
}
