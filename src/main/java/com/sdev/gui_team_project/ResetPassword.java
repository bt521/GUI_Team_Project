package com.sdev.gui_team_project;  // Incorporates the Java Package Com.SDEV.GUI_Team_Project to the Program.

import java.sql.Connection;         // Imports the java.sql.Connection Class.
import java.sql.DriverManager;      // Imports the java.sql.DriverManager Class.
import java.sql.PreparedStatement;  // Imports the java.sql.PreparedStatement Class.
import java.sql.ResultSet;          // Imports the java.sql.ResultSet Class.
import java.sql.Statement;          // Imports the java.sql.Statement Class.
import javax.swing.JOptionPane;     // Imports the javax.swing.JOptionPane Class.

// ResetPassword extends the javax. swing. JFrame
public class ResetPassword extends javax.swing.JFrame {

        // Resets the password of the user.
    public ResetPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtOldPassword = new javax.swing.JPasswordField();
        usernameIcon = new javax.swing.JLabel();
        passwordIcon = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        oldPassword = new javax.swing.JLabel();
        passwordIcon1 = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        newPassword = new javax.swing.JLabel();
        exitProgram = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(2560, 1440));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 600));

        jPanel2.setBackground(new java.awt.Color(102, 0, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        loginButton.setText("Login Page");
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 160, 40));

        signupButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        signupButton.setText("Register Page");
        signupButton.setBorder(null);
        signupButton.setBorderPainted(false);
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        jPanel2.add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jason\\Documents\\College Year 4\\COMP4604\\GUI_Team_Project\\src\\main\\java\\images\\J&B's Vehicle Rental System.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(500, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(500, 600));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUsername.setText("Username");
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel3.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 300, 50));

        txtOldPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtOldPassword.setText("Password");
        txtOldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtOldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOldPasswordFocusGained(evt);
            }
        });
        txtOldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOldPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(txtOldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 300, 50));
        jPanel3.add(usernameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 50));
        jPanel3.add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 20));

        resetButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        resetButton.setText("Reset");
        resetButton.setBorder(null);
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel3.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 160, 40));

        oldPassword.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        oldPassword.setText("(Old Password)");
        jPanel3.add(oldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));
        jPanel3.add(passwordIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, 68));

        txtNewPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNewPassword.setText("Password");
        txtNewPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNewPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewPasswordFocusGained(evt);
            }
        });
        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 300, 50));

        newPassword.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        newPassword.setText("(New Password)");
        jPanel3.add(newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        exitProgram.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        exitProgram.setForeground(new java.awt.Color(255, 0, 0));
        exitProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitProgram.setText("X");
        exitProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitProgramMouseClicked(evt);
            }
        });
        jPanel3.add(exitProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 0, 20, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jason\\Documents\\College Year 4\\COMP4604\\GUI_Team_Project\\src\\main\\java\\images\\Reset.png")); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        // txtOldPasswordActionPerformed is called when the old password action has been processed.
    private void txtOldPasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtOldPasswordActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtOldPasswordActionPerformed

        // txtUsernameActionPerformed event handler
    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtUsernameActionPerformed

        // Called when the reset button action has been processed.
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        // Sets the connection to null.
        Connection con = null;
        // Get username from txtUsername
        String username = txtUsername.getText();
        // Returns the old password.
        String oldpassword = txtOldPassword.getText();
        // Returns the new password as a string.
        String newpassword = txtNewPassword.getText();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // Creates class for UCanAccess Driver.
            con = DriverManager.getConnection("jdbc:ucanaccess://Rent.accdb");  // Connects to database file.
            Statement st = con.createStatement();   // Creates new statement with connection.
            ResultSet rs = st.executeQuery(         // Creates result set to execute query.
                    "SELECT * FROM Users WHERE Username='" + username + "' and Password='" + oldpassword + "'"); // Query is SELECT statment.
            if (rs.next()) {    // If statement for rs.next.
                st.executeUpdate("UPDATE Users SET Password='" + newpassword + "' WHERE Username='" + username + "'");  // Executes an update.
                JOptionPane.showMessageDialog(null, "Username and Password Found, Resetting Password Now!");    // Displays a dialog.
                Login l = null; // Creates a new variable called l which is connected to the Login JFrame.
                l = new Login(null);    // Switches to the Login JFrame.
                l.setVisible(true);     // Sets the Login JFrame to visible.
                this.setVisible(false); // Sets the current JFrame to invisible.
            } else { // Else statement.
                // Shows the Wrong Credentials and Try Again dialog
                JOptionPane.showMessageDialog(null, "Wrong Credentials, Please Try Again!");
            }
        } catch (Exception e) {     // Catches the exception.
            System.out.println(e);  // Prints out the exception.
        }
    }// GEN-LAST:event_resetButtonActionPerformed

        // Called when the signup button action has been processed.
    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
        RegisterCustomer rc = null;
        rc = new RegisterCustomer();
        rc.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_signupButtonActionPerformed

        // Called when the login button action has been processed.
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        Login l = null;
        l = new Login(null);
        l.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_loginButtonActionPerformed

        // Focus on the username gained.
    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
        txtUsername.setText("");
    }// GEN-LAST:event_txtUsernameFocusGained

        // txtOldPasswordFocusGained.
    private void txtOldPasswordFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtOldPasswordFocusGained
        // TODO add your handling code here:
        txtOldPassword.setText("");
    }// GEN-LAST:event_txtOldPasswordFocusGained

        // txt new password focus gained.
    private void txtNewPasswordFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtNewPasswordFocusGained
        // TODO add your handling code here:
        txtNewPassword.setText("");
    }// GEN-LAST:event_txtNewPasswordFocusGained

        // txtNewPasswordActionPerformed is called when the new password action has been processed.
    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNewPasswordActionPerformed

        // Exit the program when the user clicks the mouse.
    private void exitProgramMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_exitProgramMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_exitProgramMouseClicked

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
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitProgram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel newPassword;
    private javax.swing.JLabel oldPassword;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JLabel passwordIcon1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton signupButton;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel usernameIcon;
    // End of variables declaration//GEN-END:variables
}
