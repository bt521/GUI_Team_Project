package com.sdev.gui_team_project;

public class MainMenuAdmin extends javax.swing.JFrame {

    public MainMenuAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        exitProgram = new javax.swing.JLabel();
        manageVehicles = new javax.swing.JLabel();
        manageUsers = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButton.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setBorder(null);
        logoutButton.setBorderPainted(false);
        logoutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 470, 50));

        exitButton.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        exitButton.setText("Exit Program");
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 460, 50));

        exitProgram.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        exitProgram.setForeground(new java.awt.Color(255, 255, 255));
        exitProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitProgram.setText("X");
        exitProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitProgramMouseClicked(evt);
            }
        });
        jPanel1.add(exitProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, 30));

        manageVehicles.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\twene\\GUI\\GUI_Team_Project\\src\\main\\java\\images\\Manage Vehicles.png")); // NOI18N
        manageVehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageVehiclesMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageVehiclesMouseEntered(evt);
            }
        });
        jPanel1.add(manageVehicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 490, 600));

        manageUsers.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\twene\\GUI\\GUI_Team_Project\\src\\main\\java\\images\\Manage Customers.png")); // NOI18N
        manageUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageUsersMouseClicked(evt);
            }
        });
        jPanel1.add(manageUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        Login l = null;
        l = new Login(null);
        l.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_logoutButtonActionPerformed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_exitButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_exitButtonMouseClicked

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_exitButtonActionPerformed

    private void exitProgramMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_exitProgramMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_exitProgramMouseClicked

    private void manageVehiclesMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_manageVehiclesMouseClicked
        // TODO add your handling code here:
        ManageVehicles mv = null;
        mv = new ManageVehicles();
        mv.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_manageVehiclesMouseClicked

    private void manageUsersMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_manageUsersMouseClicked
        // TODO add your handling code here:
        ManageCustomers mc = null;
        mc = new ManageCustomers();
        mc.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_manageUsersMouseClicked

    private void manageVehiclesMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_manageVehiclesMouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_manageVehiclesMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel exitProgram;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel manageUsers;
    private javax.swing.JLabel manageVehicles;
    // End of variables declaration//GEN-END:variables
}
