
package techie;

import java.awt.Color;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.logging.Level;
import java.util.logging.Logger;




import javax.swing.table.*;


public class ranking extends javax.swing.JFrame {
private String[][] ranking = new String [20][5];
    /**
     * Creates new form ranking
     */
    public ranking() throws IOException {
        initComponents();
        jScrollPane1.setBorder(null);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(255,254,250));
       
        //changing background color
        jTable1.getColumnModel().getColumn(0).setHeaderRenderer(headerRenderer);
        jTable1.getColumnModel().getColumn(1).setHeaderRenderer(headerRenderer);
        jTable1.getColumnModel().getColumn(2).setHeaderRenderer(headerRenderer);
        
          TableColumnModel col = jTable1.getColumnModel();
          TableColumn rank=col.getColumn(0); rank.setPreferredWidth(2);
          TableColumn pints=col.getColumn(2);  pints.setPreferredWidth(2);
          DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        /*
         try {
              
            Arrays.sort(LogIn.users, (a, b) -> Integer.compare(Integer.parseInt(a[4]), Integer.parseInt(a[4])));

        } catch (Exception e) {
            Arrays.sort(LogIn.users, (a, b) -> a[4].compareTo(b[4]));

        }
        
            
          for(int i=0 ; i<  LogIn.users.length; i++){
            if(LogIn.users[i][3]== null){
                break;
             }
            
         model.insertRow(i,new Object[]{i+1, LogIn .users[i][1], LogIn .users[i][4]});
          }
           
       

 model.insertRow(3,new Object[]{3, LogIn .users[2][1], LogIn .users[2][4]});
         
        */
         model.insertRow(0,new Object[]{1, "raghad12", 300});

          model.insertRow(1,new Object[]{2, "mona20", "200"});
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rankingLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        HomeLabel = new javax.swing.JLabel();
        backGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        rankingLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        rankingLabel.setText("Ranking");
        rankingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rankingLabelMouseClicked(evt);
            }
        });
        getContentPane().add(rankingLabel);
        rankingLabel.setBounds(110, 60, 90, 40);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable1.setBackground(new java.awt.Color(255, 254, 250));
        jTable1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rank", "Username", "Points"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 200, 270, 50);

        HomeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        HomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLabelMouseClicked(evt);
            }
        });
        getContentPane().add(HomeLabel);
        HomeLabel.setBounds(10, 10, 20, 20);

        backGroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rank3.png"))); // NOI18N
        backGroundLabel.setText("jLabel1");
        getContentPane().add(backGroundLabel);
        backGroundLabel.setBounds(0, 0, 330, 600);

        setSize(new java.awt.Dimension(347, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rankingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rankingLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rankingLabelMouseClicked

    private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        try {
            new levels().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Q1Level1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ranking().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ranking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel backGroundLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel rankingLabel;
    // End of variables declaration//GEN-END:variables
}
