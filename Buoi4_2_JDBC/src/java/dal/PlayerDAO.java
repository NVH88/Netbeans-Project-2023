package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Player;

public class PlayerDAO extends DBContext{
    public ArrayList<Player> getAll(int cid) {
//        String sql = "select * from player where cid = " + cid;
        String sql = "select * from player ";
        if (cid != -1) {
            sql += "where cid = " + cid;
        }
        ArrayList<Player> arr = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
//                Player(int playerId, int numberShirt, int age, int transfer, int cid, String playerName, String nation)
                arr.add(new Player(rs.getInt("playerid"), rs.getInt("numberShirt"), rs.getInt("age"), rs.getInt("transfer"),
                    rs.getInt("cid"), rs.getString("playername"), rs.getString("nation")));
            }
        } catch (SQLException e) {            
        }
        return arr;        
    }
}