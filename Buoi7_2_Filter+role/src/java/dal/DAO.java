package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

public class DAO extends DBContext{
    public User getUser(String urname, String pass) {
        String sql = "select * from ur where urname = '" + urname + "' and pass = '" + pass + "'";
//        String sql = "select * from ur where urname = ? and pass = ?";;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new User(rs.getString("urname"), rs.getString("pass"), rs.getString("name"), rs.getInt("rol"));
            }
        } catch (SQLException e) {           
        }
        return null;       
    }
}