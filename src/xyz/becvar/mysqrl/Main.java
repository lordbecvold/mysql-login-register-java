package xyz.becvar.mysqrl;

public enum Main {

    INSTANCE; //The instance on this enum class

    private String mysql_server_ip = "localhost"; //Define mysql server ip
    private String mysql_table_name = "test"; //Define mysql db name
    private String mysql_user = "root"; //Define mysql username
    private String mysql_password = "rootPassword"; //Define mysql password

    /* The gets for mysqlConnection.java */
    public static void main(String[] args) { //Main app methode
        LoginGUI.startUi();
    }

    public String getMysql_server_ip() { //Get ip
        return mysql_server_ip;
    }

    public String getMysql_table_name() { //Get name
        return mysql_table_name;
    }

    public String getMysql_user() { //Get user
        return mysql_user;
    }

    public String getMysql_password() { //Get password
        return mysql_password;
    }
}
