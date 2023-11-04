
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSqlTest {
    private static Connection conn = null;
    public static void main(String[] args) {
        connect();
    }
    private static void connect() {
        String strConnect = "jdbc:mysql://localhost:3306/test2";
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(strConnect, "root", "nvhanh263");
            System.out.print("1");
        } catch(SQLException e) {
            System.out.println("0");
        }
    }
}
