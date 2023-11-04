package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Shipper;

public class ShipperDAO extends DBContext{
    public ArrayList<Shipper> getAll() {
        ArrayList<Shipper> arr = new ArrayList<>();
        String sql = "select * from shipper";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                arr.add(new Shipper(rs.getString("id"), rs.getString("ten"), rs.getInt("tuoi")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return arr;
    }
    
    public Shipper getShipperById(String id) {
        String sql = "select * from shipper where id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Shipper(rs.getString("id"), rs.getString("ten"), rs.getInt("tuoi"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    //insert
    public void insert(Shipper s) {
        String sql = "insert into shipper value(?, ?, ?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, s.getId());
            st.setString(2, s.getTen());
            st.setInt(3, s.getTuoi());
            st.executeUpdate();
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    
    public void delete(String id) {
        String sql = "delete from shipper where id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public void update(Shipper s) {
        String sql = "update shipper set ten = ?, tuoi = ? where id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, s.getTen());
            st.setInt(2, s.getTuoi());
            st.setString(3, s.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        ShipperDAO sp = new ShipperDAO();
        ArrayList<Shipper> arr = sp.getAll();
        System.out.println(arr.get(0).getTen() + " " + arr.get(0).getTuoi());
    }
}