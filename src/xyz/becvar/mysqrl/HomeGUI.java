package xyz.becvar.mysqrl;

import javax.swing.*;
import java.awt.*;

public class HomeGUI {

    private static JFrame frame = new JFrame();
    private static JPanel main_panel = new JPanel(new GridLayout(16,4, 4,4));
    private static JLabel welcome_text = new JLabel();
    private static JButton close_button = new JButton();

    public static void init() {

        //Basic
        frame.setTitle("Home"); //Set gui title name
        frame.setSize(800,500); //Set minimum size window
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Set def action close to x
        frame.setResizable(false); //Block change size gui
        frame.setLocationRelativeTo(null); //Set on center window after start

        //Main panel
        main_panel.setBackground(new java.awt.Color(24, 24, 24)); //Set backgroud color
        main_panel.add(welcome_text);
        main_panel.add(close_button);

        //Name reader from temp file
        String name = System.getProperty("user.name");

        //Welcome text
        welcome_text.setText("Welcome " + name);
        welcome_text.setForeground(Color.WHITE);
        welcome_text.setFont(new java.awt.Font("BOLD", 1, 14));

        //Close button
        close_button.setBackground(new java.awt.Color(255, 255, 255));
        close_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        close_button.setForeground(new java.awt.Color(0, 0, 0));
        close_button.setText("Exit open hub app");
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });

        frame.add(main_panel); //Show main panel
        frame.setVisible(true); //Show frame
    }
}

