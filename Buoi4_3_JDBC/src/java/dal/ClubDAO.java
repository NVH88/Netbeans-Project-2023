package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Club;

public class ClubDAO extends DBContext{
    public ArrayList<Club> getAll() {
        String sql = "select * from club";
        ArrayList<Club> arr = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                arr.add(new Club(rs.getInt("clubid"), rs.getInt("clubrank"), rs.getString("clubname")));
            }
        } catch (SQLException e) {            
        }
        return arr;        
    }
}