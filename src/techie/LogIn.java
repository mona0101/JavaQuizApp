package techie;

import java.io.*;
import java.util.Scanner;
import java.util.logging.*;

/**
 *
 * @author ragha
 */
public class LogIn extends javax.swing.JFrame {

    public static String name = "";
    public static int pointCount = 0;
    public static int row = -1;
    public static String users[][] = new String[20][5];
    public UserInfo u = new UserInfo();
    public showMessageDialog Message;
    public boolean value = false;

    /**
     * Creates new form SignIn
     */
    public LogIn() throws FileNotFoundException, IOException {
        initComponents();

        setTitle("Techie");
        setLocationRelativeTo(null);

        try {
            File file = new File("Accounts.txt");
            Scanner inputFile = new Scanner(file);

            int i = 0;

            while (inputFile.hasNextLine() && i < users.length) {
                String line = inputFile.nextLine();
                users[i] = line.split(",");
                i++;

            }

            inputFile.close();
        } catch (FileNotFoundException e) {

            Message = new showMessageDialog(e.getMessage());
            Message.setVisible(true);

        }//end of catch
     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signInLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JTextField();
        LogInButton = new javax.swing.JButton();
        LogoLabel = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signInLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(39, 40, 59));
        signInLabel.setText("Log in");
        getContentPane().add(signInLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 50, -1));

        UsernameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        UsernameLabel.setText("Username");
        getContentPane().add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 267, 73, -1));

        PasswordLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        PasswordLabel.setText("Password");
        getContentPane().add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 334, -1, -1));

        UsernameTextField.setBackground(new java.awt.Color(255, 254, 250));
        UsernameTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        UsernameTextField.setForeground(new java.awt.Color(153, 153, 153));
        UsernameTextField.setText("enter your username here");
        UsernameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(39, 40, 59)));
        UsernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernameTextFieldMouseClicked(evt);
            }
        });
        getContentPane().add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 291, 213, 31));

        PasswordTextField.setBackground(new java.awt.Color(255, 254, 250));
        PasswordTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        PasswordTextField.setForeground(new java.awt.Color(153, 153, 153));
        PasswordTextField.setText("enter your password here");
        PasswordTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(39, 40, 59)));
        PasswordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordTextFieldMouseClicked(evt);
            }
        });
        getContentPane().add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 358, 213, 31));

        LogInButton.setBackground(new java.awt.Color(39, 40, 59));
        LogInButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setText("Log in");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 446, 154, 30));

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoNoText-06.png"))); // NOI18N
        getContentPane().add(LogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 184, 101));

        Back.setFont(new java.awt.Font("Segoe Script", 0, 26)); // NOI18N
        Back.setText("<");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Solidbackgrond.png"))); // NOI18N
        getContentPane().add(BackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 320, 620));

        setBounds(0, 0, 330, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // TODO add your handling code here:

        String UserNameInfo = UsernameTextField.getText().trim();
        String passInfo = PasswordTextField.getText().trim();

        //to search 
        for (int i = 0; i < users.length; i++) {
            if (UserNameInfo.equals(users[i][0])) {
                row = i;
            }//end of if
        }//end of loop

        if (value == false) {//if there is exception

            try {

                if (!UserNameInfo.isEmpty() && !passInfo.isEmpty() && row != -1) {//to check if it is empty or not

                    u.setUserName(UserNameInfo);
                    u.setPassword(passInfo, users[row][2]);
                    value = true;//means there is no exception 

                }//end of if
                else if (UserNameInfo.isEmpty() || passInfo.isEmpty()) {

                    Message = new showMessageDialog("You can't leave any null values!");
                    Message.setVisible(true);

                }//end of else

            } catch (userNameException e) {

                Message = new showMessageDialog(e.getMessage());
                Message.setVisible(true);
            }//end of catch
            catch (passwordException e) {
                Message = new showMessageDialog(e.getMessage());
                Message.setVisible(true);

            }//end of catch

            if (value == true) {//if there is no exception display next frame

                this.dispose();//close corrent frame

                try {
                    new levels().setVisible(true);//go to levels frame

                } catch (IOException ex) {
                    Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
                }
            }//end of if

            if (row == -1 && !UserNameInfo.isEmpty()
                    && !passInfo.isEmpty()) {//if username not found in file 
//                this.dispose();
//                new Welcome().setVisible(true);
                Message = new showMessageDialog("You don't have an account!\n" + "Please choose sign up to create one");
                Message.setVisible(true);
            }//end of if

            if (row != -1) {//to to update the points
                name = users[row][1].trim();
                pointCount = Integer.parseInt(users[row][4].trim());
              
                
            }//end of if

            
        }//end of method

    }//GEN-LAST:event_LogInButtonActionPerformed
    // TODO add your handling code here:

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
       this.dispose();//to close the corrent frame
        new Welcome().setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void UsernameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameTextFieldMouseClicked
        // TODO add your handling code here:
        UsernameTextField.setText(null);//to remove text when you click on textField

    }//GEN-LAST:event_UsernameTextFieldMouseClicked

    private void PasswordTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordTextFieldMouseClicked
        // TODO add your handling code here:
        PasswordTextField.setText(null);//to remove text when you click on textField
    }//GEN-LAST:event_PasswordTextFieldMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
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
            java.util.logging.Logger.getLogger(LogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LogIn().setVisible(true);

                } catch (IOException ex) {
                    Logger.getLogger(LogIn.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JButton LogInButton;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel signInLabel;
    // End of variables declaration//GEN-END:variables

    void setVisiable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
