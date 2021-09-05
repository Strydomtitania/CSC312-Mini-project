/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shuaib UWC
 */
public class AdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public AdminMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CategoryPanel = new javax.swing.JPanel();
        Mathematics_btn = new javax.swing.JButton();
        ComputerSC_btn = new javax.swing.JButton();
        Physics_btn = new javax.swing.JButton();
        Accounting_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        InsertBookbtn = new javax.swing.JButton();
        EditBookbtn = new javax.swing.JButton();
        DeleteBookbtn = new javax.swing.JButton();
        Reportsbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CategoryPanel.setBackground(new java.awt.Color(34, 0, 0));
        CategoryPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CategoryPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CategoryPanelMouseExited(evt);
            }
        });
        CategoryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mathematics_btn.setForeground(new java.awt.Color(204, 204, 204));
        Mathematics_btn.setText("Mathematics");
        Mathematics_btn.setBorder(null);
        Mathematics_btn.setContentAreaFilled(false);
        Mathematics_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mathematics_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Mathematics_btnMouseEntered(evt);
            }
        });
        CategoryPanel.add(Mathematics_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 90, 20));

        ComputerSC_btn.setForeground(new java.awt.Color(204, 204, 204));
        ComputerSC_btn.setText("Computer Science");
        ComputerSC_btn.setBorder(null);
        ComputerSC_btn.setContentAreaFilled(false);
        ComputerSC_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComputerSC_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ComputerSC_btnMouseEntered(evt);
            }
        });
        CategoryPanel.add(ComputerSC_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 100, 20));

        Physics_btn.setForeground(new java.awt.Color(204, 204, 204));
        Physics_btn.setText("Physics");
        Physics_btn.setBorder(null);
        Physics_btn.setContentAreaFilled(false);
        Physics_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Physics_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Physics_btnMouseEntered(evt);
            }
        });
        CategoryPanel.add(Physics_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 90, 20));

        Accounting_btn.setForeground(new java.awt.Color(204, 204, 204));
        Accounting_btn.setText("Accounting");
        Accounting_btn.setBorder(null);
        Accounting_btn.setContentAreaFilled(false);
        Accounting_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accounting_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Accounting_btnMouseEntered(evt);
            }
        });
        CategoryPanel.add(Accounting_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 90, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Category");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        CategoryPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jPanel1.add(CategoryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 0, 160));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shuaib UWC\\Desktop\\Mini Project SE\\UI images\\Menu.jpeg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 780, -1));

        jButton2.setBackground(new java.awt.Color(34, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Books");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 40));

        jButton3.setBackground(new java.awt.Color(34, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Return Book");
        jButton3.setBorder(null);
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 170, 40));

        LogOut.setBackground(new java.awt.Color(34, 0, 0));
        LogOut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 0, 0));
        LogOut.setText("Log Out");
        LogOut.setBorder(null);
        LogOut.setBorderPainted(false);
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 170, 40));

        InsertBookbtn.setBackground(new java.awt.Color(34, 0, 0));
        InsertBookbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        InsertBookbtn.setForeground(new java.awt.Color(255, 255, 255));
        InsertBookbtn.setText("Insert Book");
        InsertBookbtn.setBorder(null);
        jPanel1.add(InsertBookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, 40));

        EditBookbtn.setBackground(new java.awt.Color(34, 0, 0));
        EditBookbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EditBookbtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBookbtn.setText("Edit Book");
        EditBookbtn.setBorder(null);
        jPanel1.add(EditBookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 170, 40));

        DeleteBookbtn.setBackground(new java.awt.Color(34, 0, 0));
        DeleteBookbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteBookbtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBookbtn.setText("Delete Book");
        DeleteBookbtn.setBorder(null);
        jPanel1.add(DeleteBookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, 40));

        Reportsbtn.setBackground(new java.awt.Color(34, 0, 0));
        Reportsbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Reportsbtn.setForeground(new java.awt.Color(255, 255, 255));
        Reportsbtn.setText("Reports");
        Reportsbtn.setBorder(null);
        jPanel1.add(Reportsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shuaib UWC\\Desktop\\Mini Project SE\\UI images\\logo.jpeg")); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        setVisible(false);
        new LoginPage().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_LogOutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          // TODO add your handling code here:
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        CategoryPanel.setSize(100, 170);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        CategoryPanel.setSize(0,0);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseExited

    private void CategoryPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryPanelMouseEntered
        CategoryPanel.setSize(100,170);// TODO add your handling code here:
    }//GEN-LAST:event_CategoryPanelMouseEntered

    private void CategoryPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryPanelMouseExited
        CategoryPanel.setSize(0,0);// TODO add your handling code here:
    }//GEN-LAST:event_CategoryPanelMouseExited

    private void Mathematics_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mathematics_btnMouseEntered
        CategoryPanel.setSize(100,170);// TODO add your handling code here:
    }//GEN-LAST:event_Mathematics_btnMouseEntered

    private void ComputerSC_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComputerSC_btnMouseEntered
        CategoryPanel.setSize(100,170);// TODO add your handling code here:
    }//GEN-LAST:event_ComputerSC_btnMouseEntered

    private void Physics_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Physics_btnMouseEntered
        CategoryPanel.setSize(100,170);// TODO add your handling code here:
    }//GEN-LAST:event_Physics_btnMouseEntered

    private void Accounting_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Accounting_btnMouseEntered
        CategoryPanel.setSize(100,170);// TODO add your handling code here:
    }//GEN-LAST:event_Accounting_btnMouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        CategoryPanel.setSize(100,170);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accounting_btn;
    private javax.swing.JPanel CategoryPanel;
    private javax.swing.JButton ComputerSC_btn;
    private javax.swing.JButton DeleteBookbtn;
    private javax.swing.JButton EditBookbtn;
    private javax.swing.JButton InsertBookbtn;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Mathematics_btn;
    private javax.swing.JButton Physics_btn;
    private javax.swing.JButton Reportsbtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
