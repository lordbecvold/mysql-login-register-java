package xyz.becvar.mysqrl.utils;

import xyz.becvar.mysqrl.Main;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {

    // create a function to connect with mysql database
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + Main.INSTANCE.getMysql_server_ip() + "/" + Main.INSTANCE.getMysql_table_name(), Main.INSTANCE.getMysql_user(), Main.INSTANCE.getMysql_password());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
