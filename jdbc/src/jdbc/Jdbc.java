package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jdbc {
    public static Connection getJDBCConnection() {
        String url = "jdbc:mysql://localhost:3306/test2";
        String user = "root";
        String password = "nvhanh263";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("loi1");
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("loi2");
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;       
    }
    
    public static void main(String[] args) {
        Connection conn = getJDBCConnection();
        if (conn != null) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}