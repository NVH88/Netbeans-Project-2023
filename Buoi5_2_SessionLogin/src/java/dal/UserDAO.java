package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

public class UserDAO extends DBContext{
    public User getUserByUrname(String username) {
        String sql = "select * from user where urname = '" + username + "'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new User(rs.getString("urname"), rs.getString("pass"), rs.getString("fullname"), rs.getInt("phonenum"));
            }
        } catch (SQLException e) {           
        }
        return null;        
    }
    
    public User getUser(String username, String password) {
        String sql = "select * from user where urname = '" + username + "' and pass = '" + password + "'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new User(rs.getString("urname"), rs.getString("pass"), rs.getString("fullname"), rs.getInt("phonenum"));
            }
        } catch (SQLException e) {           
        }
        return null;        
    }
    
    public void editUser(String username, String fullname, int phonenum) {
        String sql = "update user set fullname = '" + fullname + "', phonenum = '" + 
                phonenum + "' where urname = '" + username + "'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException e) {           
        }     
    }
    
    public void changePassword(String username, String password) {
        String sql = "update user set pass = '" + password + "' where urname = '" + username + "'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException e) {           
        }
    }
    
    public void insertUser(String urname, String pass, String fullname, int phonenum) {
        String sql = "insert into user() value(?, ?, ?, ?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, urname);
            st.setString(2, pass);
            st.setString(3, fullname);
            st.setInt(4, phonenum);
            st.executeUpdate();
        } catch (SQLException e) {           
        }
    }
}