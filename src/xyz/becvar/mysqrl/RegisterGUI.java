package xyz.becvar.mysqrl;

import xyz.becvar.mysqrl.utils.MysqlConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegisterGUI extends JFrame {

    //Variabiles
    private javax.swing.JButton jButton_CANCEL;
    private javax.swing.JButton jButton_Register_;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_PASS;
    private javax.swing.JPasswordField jPasswordField_REPASS;
    private javax.swing.JTextField jTextField_UN;

    public RegisterGUI() {
        initComponents(); //Run initComponents() methode
        this.setLocationRelativeTo(null); //Set gui to center screen
    }

    private void initComponents() {

        //Set app title text
        setTitle("Mysql register");

        //Objects
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_UN = new javax.swing.JTextField();
        jPasswordField_PASS = new javax.swing.JPasswordField();
        jButton_Register_ = new javax.swing.JButton();
        jButton_CANCEL = new javax.swing.JButton();
        jLabelRegister = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField_REPASS = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        //Default action on click x
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //Set gui color backgroud
        jPanel2.setBackground(new java.awt.Color(24, 24, 24));

        //Username text label
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Username:");

        //Password text label
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Password:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Retype Pass:");

        //Name text field
        jTextField_UN.setBackground(new java.awt.Color(108, 122, 100));
        jTextField_UN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_UN.setForeground(new java.awt.Color(0, 0, 0));

        //Password text Field
        jPasswordField_PASS.setBackground(new java.awt.Color(108, 122, 100));
        jPasswordField_PASS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_PASS.setForeground(new java.awt.Color(0, 0, 0));

        //Retype password Field
        jPasswordField_REPASS.setBackground(new java.awt.Color(108, 122, 100));
        jPasswordField_REPASS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_REPASS.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField_REPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Register_ActionPerformed(evt);
            }
        });

        //Register button
        jButton_Register_.setBackground(new java.awt.Color(34, 34, 240));
        jButton_Register_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Register_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Register_.setText("Submit");
        jButton_Register_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Register_ActionPerformed(evt);
            }
        });

        //Cancel button
        jButton_CANCEL.setBackground(new java.awt.Color(204, 34, 34));
        jButton_CANCEL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_CANCEL.setForeground(new java.awt.Color(255, 255, 255));
        jButton_CANCEL.setText("Cancel");
        jButton_CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CANCELActionPerformed(evt);
            }
        });

        //Login text button
        jLabelRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegister.setText("click for login");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });

        //This si calling SetLayout methode
        setLayout();
        pack();
    }

    //Layout gui config
    private void setLayout() {
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(89, 89, 89).addComponent(jButton_CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(26, 26, 26).addComponent(jButton_Register_, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel2Layout.createSequentialGroup().addGap(43, 43, 43).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(8, 8, 8).addComponent(jLabel4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jTextField_UN, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel2Layout.createSequentialGroup().addGap(12, 12, 12).addComponent(jLabel5).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPasswordField_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))).addGroup(jPanel2Layout.createSequentialGroup().addGap(34, 34, 34).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel8).addComponent(jLabel10).addComponent(jLabel9)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jPasswordField_REPASS, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))).addGroup(jPanel2Layout.createSequentialGroup().addGap(146, 146, 146).addComponent(jLabelRegister))).addContainerGap(24, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(51, 51, 51).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(jTextField_UN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jPasswordField_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel5)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel8).addComponent(jPasswordField_REPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel9)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel10)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton_CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton_Register_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabelRegister).addGap(30, 30, 30)));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 0, 0).addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }

    //This si methode click on login text button
    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {
        LoginGUI lgf = new LoginGUI();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    //This is register methode
    private void jButton_Register_ActionPerformed(java.awt.event.ActionEvent evt) {

        //Strings
        String uname = jTextField_UN.getText();
        String pass = String.valueOf(jPasswordField_PASS.getPassword());
        String re_pass = String.valueOf(jPasswordField_REPASS.getPassword());

        //Prevention ifs
        if(uname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "You must addd name");
        }
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "You must add password");
        }
        else if(!pass.equals(re_pass))
        {
            JOptionPane.showMessageDialog(null, "Please retype yout password");
        }
        else if(checkUsername(uname))
        {
            JOptionPane.showMessageDialog(null, "This username is registred!");
        }
        else{
            //This else if register succes

            PreparedStatement ps;

            //This is mysql query
            String query = "INSERT INTO `users`(`name`, `password`) VALUES (?,?)";

            //This si register methode
            try {
                ps = MysqlConnection.getConnection().prepareStatement(query);
                ps.setString(1, uname);
                ps.setString(2, pass);
                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "Account registred! \nYou can login");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    //Check username in mysql if exist
    public boolean checkUsername(String username)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `users` WHERE `name` =?";
        try {
            ps = MysqlConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if(rs.next())
            {
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUser;
    }

    //This is cancel button funcion
    private void jButton_CANCELActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
}

