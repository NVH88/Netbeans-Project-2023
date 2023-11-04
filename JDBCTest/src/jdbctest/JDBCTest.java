package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;


public class JDBCTest {

    public static void main(String[] args) {
        try {
            String url = "jdbc:sqlserver://DESKTOP-FVABLB5\\SQLEXPRESS;encrypt=true;trustServerCertificate=true";
            String username = "DESKTOP-FVABLB5\\DELL";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            if(con != null) {
                System.out.println("Connect successfully !");
            }
            else {
                System.out.println("Connect failled !");
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
