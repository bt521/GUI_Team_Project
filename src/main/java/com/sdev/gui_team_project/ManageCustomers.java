package com.sdev.gui_team_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ManageCustomers extends javax.swing.JFrame {

    public ManageCustomers() {
        initComponents();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://Rent.accdb");
            Statement st = con.createStatement();
            String SQL = "SELECT * FROM Users WHERE Role='Customer'";
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                String cid = String.valueOf(rs.getInt("ID"));
                String cuser = rs.getString("Username");
                String cpass = rs.getString("Password");
                String cfname = rs.getString("FirstName");
                String clname = rs.getString("LastName");
                String cgender = rs.getString("Gender");
                String crole = rs.getString("Role");
                String crent = String.valueOf(rs.getInt("RentID"));
                String tbData[] = { cid, cuser, "******", cfname, clname, cgender, crent };
                DefaultTableModel tblModel = (DefaultTableModel) customersTable.getModel();
                tblModel.addRow(tbData);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
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
        txtCustomerID = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customersTable = new javax.swing.JTable();
        txtGender = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        exitProgram = new javax.swing.JLabel();
        manageVehicles = new javax.swing.JButton();
        mainMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCustomerID.setText("Customer ID");
        txtCustomerID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCustomerID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCustomerIDFocusGained(evt);
            }
        });
        txtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 92, 30));

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
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 92, 30));

        txtFirstName.setText("First Name");
        txtFirstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFirstNameFocusGained(evt);
            }
        });
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 92, 30));

        txtLastName.setText("Last Name");
        txtLastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastNameFocusGained(evt);
            }
        });
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 92, 30));

        addButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addButton.setText("Add");
        addButton.setBorder(null);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 120, 43));

        editButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        editButton.setText("Edit");
        editButton.setBorder(null);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 120, 43));

        deleteButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setBorder(null);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 120, 43));

        customersTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Customer ID", "Username", "Password", "First Name", "Last Name", "Gender", "Rent ID"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(customersTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 976, 165));

        txtGender.setText("Gender");
        txtGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtGender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGenderFocusGained(evt);
            }
        });
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        jPanel1.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 92, 30));

        txtPassword.setText("Password");
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 92, 30));

        exitProgram.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        exitProgram.setForeground(new java.awt.Color(255, 0, 0));
        exitProgram.setText("X");
        exitProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitProgramMouseClicked(evt);
            }
        });
        jPanel1.add(exitProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(972, 13, -1, 20));

        manageVehicles.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        manageVehicles.setText("Manage Vehicles");
        manageVehicles.setBorder(null);
        manageVehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVehiclesActionPerformed(evt);
            }
        });
        jPanel1.add(manageVehicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 190, 40));

        mainMenu.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        mainMenu.setText("Main Menu");
        mainMenu.setBorder(null);
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuActionPerformed(evt);
            }
        });
        jPanel1.add(mainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 190, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\twene\\GUI\\GUI_Team_Project\\src\\main\\java\\images\\Manage Customers Menu.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        /*
         * PreparedStatement pst = null;
         * ResultSet rs = null;
         */
        String customerid = null, customeruser, customerpass, customerfname, customerlname, customergender;
        customerid = txtCustomerID.getText();
        customeruser = txtUsername.getText();
        customerpass = txtPassword.getText();
        customerfname = txtUsername.getText();
        customerlname = txtPassword.getText();
        customergender = txtGender.getText();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Rent.accdb");
            Statement st = con.createStatement();
            String SQL = "INSERT INTO Users(ID, Username, Password, FirstName, LastName, Gender, Role, RentID) VALUES('"
                    + customerid
                    + "','" + customeruser + "', '" + customerpass + "', '" + customerfname + "', '" + customerlname
                    + "', '" + customergender + "', 'Customer', '0')";
            st = con.createStatement();
            st.executeUpdate(SQL);
            JOptionPane.showMessageDialog(null, "Added Customer Details to the Database!");
            ManageCustomers mc = new ManageCustomers();
            mc.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }// GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        String customerid = null, customeruser, customerpass, customerfname, customerlname, customergender;
        customerid = txtCustomerID.getText();
        customeruser = txtUsername.getText();
        customerpass = txtPassword.getText();
        customerfname = txtFirstName.getText();
        customerlname = txtLastName.getText();
        customergender = txtGender.getText();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Rent.accdb");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Users WHERE Role='Customer'");
            if (rs.next()) {
                st.executeUpdate("UPDATE Users SET Username='" + customeruser + "', Password='" + customerpass
                        + "', FirstName='" + customerfname + "', LastName='" + customerlname + "', Gender='"
                        + customergender + "' WHERE ID='" + customerid + "'");
                JOptionPane.showMessageDialog(null, "Updating Customer Information to the Database!");
            } else {
                JOptionPane.showMessageDialog(null, "An Error Occured, Please Try Again!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }// GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        String customerid = null, customeruser, customerpass, customerfname, customerlname, customergender;
        customerid = txtCustomerID.getText();
        customeruser = txtUsername.getText();
        customerpass = txtPassword.getText();
        customerfname = txtFirstName.getText();
        customerlname = txtLastName.getText();
        customergender = txtGender.getText();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Rent.accdb");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Users");
            if (rs.next()) {
                String userInput;
                userInput = JOptionPane.showInputDialog("Enter the ID of the User You Want Removed");
                st.executeUpdate("DELETE FROM Users WHERE ID='" + userInput + "'");
                JOptionPane.showMessageDialog(null, "Removing User from the Database!");
            } else {
                JOptionPane.showMessageDialog(null, "An Error Occured, Please Try Again!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }// GEN-LAST:event_deleteButtonActionPerformed

    private void txtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCustomerIDActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCustomerIDActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtUsernameActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtLastNameActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtGenderActionPerformed

    private void txtCustomerIDFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtCustomerIDFocusGained
        // TODO add your handling code here:
        txtCustomerID.setText("");
    }// GEN-LAST:event_txtCustomerIDFocusGained

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
        txtUsername.setText("");
    }// GEN-LAST:event_txtUsernameFocusGained

    private void txtFirstNameFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtFirstNameFocusGained
        // TODO add your handling code here:
        txtFirstName.setText("");
    }// GEN-LAST:event_txtFirstNameFocusGained

    private void txtLastNameFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtLastNameFocusGained
        // TODO add your handling code here:
        txtLastName.setText("");
    }// GEN-LAST:event_txtLastNameFocusGained

    private void txtGenderFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtGenderFocusGained
        // TODO add your handling code here:
        txtGender.setText("");
    }// GEN-LAST:event_txtGenderFocusGained

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        txtPassword.setText("");
    }// GEN-LAST:event_txtPasswordFocusGained

    private void exitProgramMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_exitProgramMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_exitProgramMouseClicked

    private void manageVehiclesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_manageVehiclesActionPerformed
        // TODO add your handling code here:
        ManageVehicles mv = null;
        mv = new ManageVehicles();
        mv.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_manageVehiclesActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPasswordActionPerformed

    private void mainMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mainMenuActionPerformed
        // TODO add your handling code here:
        MainMenuAdmin mma = null;
        mma = new MainMenuAdmin();
        mma.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_mainMenuActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCustomers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTable customersTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel exitProgram;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainMenu;
    private javax.swing.JButton manageVehicles;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
