package xyz.becvar.mysqrl;

import xyz.becvar.mysqrl.utils.MysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class LoginGUI extends JFrame {

    private javax.swing.JButton jButton_LOGIN;
    private javax.swing.JButton jButton_CANCEL;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;

    public LoginGUI() {
        initComponents(); //Run initComponents() methode
        this.setLocationRelativeTo(null); //Set gui to center screen
    }

    private void initComponents() {

        //Set app title text
        setTitle("Mysql java login");

        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton_LOGIN = new javax.swing.JButton();
        jButton_CANCEL = new javax.swing.JButton();
        jLabelRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setResizable(false);

        //Set gui color backgroud
        jPanel2.setBackground(new java.awt.Color(24, 24, 24));

        //Name lable
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Name:");

        //Password lable
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Password:");

        //Name text field input
        jTextField1.setBackground(new java.awt.Color(108, 122, 100));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));

        //Password text filed input
        jPasswordField1.setBackground(new java.awt.Color(108, 122, 100));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LOGINActionPerformed(evt);
            }
        });

        //Login button
        jButton_LOGIN.setBackground(new java.awt.Color(34, 34, 240));
        jButton_LOGIN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_LOGIN.setForeground(new java.awt.Color(255, 255, 255));
        jButton_LOGIN.setText("Login");
        jButton_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LOGINActionPerformed(evt);
            }
        });

        //Cancel button
        jButton_CANCEL.setBackground(new java.awt.Color(240, 34, 34));
        jButton_CANCEL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_CANCEL.setForeground(new java.awt.Color(255, 255, 255));
        jButton_CANCEL.setText("Cancel");
        jButton_CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CANCELActionPerformed(evt);
            }
        });

        //Register button in text
        jLabelRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegister.setText("click for register");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });

        setLayout();
        pack();
    }

    //Gui Layout settings
    private void setLayout() {
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(31, 31, 31).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(24, 24, 24).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel5).addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton_CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addComponent(jLabelRegister).addContainerGap(22, Short.MAX_VALUE)));
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(68, 68, 68).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPasswordField1)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jButton_CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(26, 26, 26).addComponent(jButton_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(jPanel2Layout.createSequentialGroup().addGap(76, 76, 76).addComponent(jLabelRegister))).addContainerGap(59, Short.MAX_VALUE)));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 0, 0).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
    }

    //Click on button register funcion
    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {
        RegisterGUI rgf = new RegisterGUI();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    //Click on button Cancel funcion
    private void jButton_CANCELActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    //Click on button login funcion
    private void jButton_LOGINActionPerformed(java.awt.event.ActionEvent evt) {

        PreparedStatement ps;
        ResultSet rs;

        //Strings name password var
        String name = jTextField1.getText();
        String password = String.valueOf(jPasswordField1.getPassword());

        //Mysql login query (Must user mysql login connectro lib)
        String query = "SELECT * FROM `users` WHERE `name` =? AND `password` =?";

        //Mysql login methode
        try {
            ps = MysqlConnection.getConnection().prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if(rs.next()) {
                HomeGUI.init();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Your password or name us wrong!", "Login Failed", 2);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Starting methode called from Main.java
    public static void startUi() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }
}

