package com.sdev.gui_team_project;  // Incorporates the Java Package Com.SDEV.GUI_Team_Project to the Program.

import java.sql.Connection;                 // Imports the Java.SQL.Connection Class.
import java.sql.DriverManager;              // Imports the Java.SQL.DriverManager Class.
import java.sql.ResultSet;                  // Imports the Java.SQL.ResultSet Class.
import java.sql.Statement;                  // Imports the Java.SQL.Statement Class.
import javax.swing.JOptionPane;             // Imports the JavaX.Swing.JOptionPane Class.
import javax.swing.JTable;                  // Imports the JavaX.Swing.JTable Class.
import javax.swing.table.DefaultTableModel; // Imports the JavaX.Swing.Table.DefaultTableModel Class.

public class ManageCustomers extends javax.swing.JFrame {   // Creates a Public Class Called Login Which Extends Onto JavaX.Swing.JFrame.

    // This method initializes the customer manager.
    public ManageCustomers() {
        initComponents();
        try { // Try Catch Statement is initialised here.
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // Creates a class for the UCanAccess dependency.
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://Rent.accdb");   // Initiliases the variable con to connect to the database file.
            Statement st = con.createStatement();   // Creates an object Statement called st which creates a connection statement.
            String SQL = "SELECT * FROM Users WHERE Role='Customer'";   // Creates a String called SQL which SELECTS all information form USERS WHERE ROLE='Customer'.
            ResultSet rs = st.executeQuery(SQL);    // Creates an object ResultSet called rs which executes the above statements query.
            while (rs.next()) { // Creates a while loop if the information in the result set works.
                String cid = String.valueOf(rs.getInt("ID"));       // Creates a String called cid which links to ID in the database.
                String cuser = rs.getString("Username");            // Creates a String called cuser which links to Username in the database.
                String cpass = rs.getString("Password");            // Creates a String called cpass which links to Password in the database.
                String cfname = rs.getString("FirstName");          // Creates a String called cfname which links to FirstName in the database.
                String clname = rs.getString("LastName");           // Creates a String called clname which links to LastName in the database.
                String cgender = rs.getString("Gender");            // Creates a String called cgender which links to Gender in the database.
                String crole = rs.getString("Role");                // Creates a String called crole which links to Role in the database.
                String crent = String.valueOf(rs.getInt("RentID")); // Creates a String called crent which links to RentID in the database.
                String tbData[] = { cid, cuser, "******", cfname, clname, cgender, crent }; // Creates an array of table data to be submitted and displayed inside of the table.
                DefaultTableModel tblModel = (DefaultTableModel) customersTable.getModel(); // Returns the model of the customer table.
                tblModel.addRow(tbData);    // Adds a row to the model.
            }
        } catch (Exception e) {     // Tries to catch exception with exception handling.
            System.out.println(e);  // Prints out exceptions if needed in the terminal below.
        }
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
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Username", "Password", "First Name", "Last Name", "Gender", "Rent ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jason\\Documents\\College Year 4\\COMP4604\\GUI_Team_Project\\src\\main\\java\\images\\Manage Customers Menu.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Runs when the add button has been clicked and adds information into the database.
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Connection con = null;  // Sets the connection to null.
        // Creates a mutltitude of strings for customer information.
        String customerid = null, customeruser, customerpass, customerfname, customerlname, customergender;
        customerid = txtCustomerID.getText();   // Makes the input of the user = to customerid.
        customeruser = txtUsername.getText();   // Makes the input of the user = to customeruser.
        customerpass = txtPassword.getText();   // Makes the input of the user = to customerpass.
        customerfname = txtUsername.getText();  // Makes the input of the user = to customerfname.
        customerlname = txtPassword.getText();  // Makes the input of the user = to customerlname.
        customergender = txtGender.getText();   // Makes the input of the user = to customergender.
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // Creates a class for the UCanAccess dependency.
            con = DriverManager.getConnection("jdbc:ucanaccess://Rent.accdb");  // Initiliases the variable con to connect to the database file.
            Statement st = con.createStatement();   // Creates an object Statement called st which creates a connection statement.
            String SQL = "INSERT INTO Users(ID, Username, Password, FirstName, LastName, Gender, Role, RentID) VALUES('"
                    + customerid
                    + "','" + customeruser + "', '" + customerpass + "', '" + customerfname + "', '" + customerlname
                    + "', '" + customergender + "', 'Customer', '0')"; // Creates a String called SQL which INSERTS information into the database.
            st = con.createStatement(); // Makes st equal to creating a statement.
            st.executeUpdate(SQL);      // Executes the query SQL.
            JOptionPane.showMessageDialog(null, "Added Customer Details to the Database!"); // Displays a dialog that states that the customer details were added to the database.
            ManageCustomers mc = new ManageCustomers(); // Directs to the ManageCustomers page.
            mc.setVisible(true);        // Sets the ManageCustomers page as visible.
            this.setVisible(false);     // Sets the current page is invisible.
        } catch (Exception e) {             // Catch for exceptions in the try catch statement.
            System.out.println(e);          // Prints out the exceptions in the terminal below.
        }
    }

    // Runs when the edit button has been clicked and updates information into the database.
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Connection con = null;  // Sets the connection to null.
        // Creates a mutltitude of strings for customer information.
        String customerid = null, customeruser, customerpass, customerfname, customerlname, customergender;
        customerid = txtCustomerID.getText();   // Makes the input of the user = to customerid.
        customeruser = txtUsername.getText();   // Makes the input of the user = to customeruser.
        customerpass = txtPassword.getText();   // Makes the input of the user = to customerpass.
        customerfname = txtFirstName.getText(); // Makes the input of the user = to customerfname.
        customerlname = txtLastName.getText();  // Makes the input of the user = to customerlname.
        customergender = txtGender.getText();   // Makes the input of the user = to customergender.
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // Creates a class for the UCanAccess dependency.
            con = DriverManager.getConnection("jdbc:ucanaccess://Rent.accdb");  // Initiliases the variable con to connect to the database file.
            Statement st = con.createStatement();   // Creates an object Statement called st which creates a connection statement.
            ResultSet rs = st.executeQuery("SELECT * FROM Users WHERE Role='Customer'");    // Creates a String called SQL which SELECTS all information form USERS WHERE ROLE='Customer'.
            if (rs.next()) {    // If statement for when the Result Set runs.
                st.executeUpdate("UPDATE Users SET Username='" + customeruser + "', Password='" + customerpass
                        + "', FirstName='" + customerfname + "', LastName='" + customerlname + "', Gender='"
                        + customergender + "' WHERE ID='" + customerid + "'");  // Executes an update to the statement.
                JOptionPane.showMessageDialog(null, "Updating Customer Information to the Database!"); // Displays a dialog stating that the customer information has been updated.
            } else {    // Else statement if that doesn't occur.
                JOptionPane.showMessageDialog(null, "An Error Occured, Please Try Again!"); // Displays a dialog stating that an error occured.
            }
        } catch (Exception e) {     // Catch for exceptions.
            System.out.println(e);  // Prints out exception in terminal below.
        }
    }

    // Runs when the delete button has been clicked and updates information into the database.
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Connection con = null;  // Sets the connection to null.
        // Creates a mutltitude of strings for customer information.
        String customerid = null, customeruser, customerpass, customerfname, customerlname, customergender;
        customerid = txtCustomerID.getText();   // Makes the input of the user = to customerid.
        customeruser = txtUsername.getText();   // Makes the input of the user = to customeruser.
        customerpass = txtPassword.getText();   // Makes the input of the user = to customerpass.
        customerfname = txtFirstName.getText(); // Makes the input of the user = to customerfname.
        customerlname = txtLastName.getText();  // Makes the input of the user = to customerlname.
        customergender = txtGender.getText();   // Makes the input of the user = to customergender.
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // Creates a class for the UCanAccess dependency.
            con = DriverManager.getConnection("jdbc:ucanaccess://Rent.accdb");  // Initiliases the variable con to connect to the database file.
            Statement st = con.createStatement();   // Creates an object Statement called st which creates a connection statement.
            ResultSet rs = st.executeQuery("SELECT * FROM Users");  // Creates a String called SQL which SELECTS all information form USERS.
            if (rs.next()) {    // If statement for when the Result Set runs.
                String userInput; // Creates a String called userInput.
                userInput = JOptionPane.showInputDialog("Enter the ID of the User You Want Removed"); // Displays a dialog asking the user to enter an ID.
                st.executeUpdate("DELETE FROM Users WHERE ID='" + userInput + "'");
                JOptionPane.showMessageDialog(null, "Removing User from the Database!");    // Displays a dialog stating a user was removed.
            } else {
                JOptionPane.showMessageDialog(null, "An Error Occured, Please Try Again!"); // Displays dialog stating an error occured.
            }
        } catch (Exception e) {     // Creates a catch for exceptions.
            System.out.println(e);  // Prints out an exception in the terminal window.
        }
    }

        // txtCustomerIDActionPerformed event handler
    private void txtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {
    }

        // txtUsernameActionPerformed event.
    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {
    }

        // txtFirstNameActionPerformed event.
    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {
    }

        // This method is called when the last txt name action has been processed.
    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {
    }

        // txtGenderActionPerformed event handler
    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {
    }

        // txt customer id focus gained
    private void txtCustomerIDFocusGained(java.awt.event.FocusEvent evt) {
        txtCustomerID.setText("");
    }

        // Focus the username.
    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {
        txtUsername.setText("");
    }

        // Focus the first name with a gon.
    private void txtFirstNameFocusGained(java.awt.event.FocusEvent evt) {
        txtFirstName.setText("");
    }

        // Focus the last name in gained format.
    private void txtLastNameFocusGained(java.awt.event.FocusEvent evt) {
        txtLastName.setText("");
    }

        // txtGenderFocusGained - Focus event
    private void txtGenderFocusGained(java.awt.event.FocusEvent evt) {
        txtGender.setText("");
    }

        // Focus gon on the password.
    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {
        txtPassword.setText("");
    }

    
        // Exits the program when the user clicks the mouse button.
    private void exitProgramMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

        // Handle ManageVehicles action.
    private void manageVehiclesActionPerformed(java.awt.event.ActionEvent evt) {
        ManageVehicles mv = null;
        mv = new ManageVehicles();
        mv.setVisible(true);
        this.setVisible(false);
    }

        // This method is called when the txt password action has been processed.
    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {
    }

        // This method is called when the main menu action is processed.
    private void mainMenuActionPerformed(java.awt.event.ActionEvent evt) {
        MainMenuAdmin mma = null;
        mma = new MainMenuAdmin();
        mma.setVisible(true);
        this.setVisible(false);
    }

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
