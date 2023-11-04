package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Player;

public class PlayerDAO extends DBContext{
    public ArrayList<Player> getAll(int cid, String sbn, String agefrom, String ageto,
            String pricefrom, String priceto) {
//        String sql = "select * from player ";
        String sql = "select * from player where 1 = 1 ";
        if (cid != -1) {
            sql += " and cid = " + cid;
        }
        if (sbn != null && sbn.length() > 0) {
            sql += " and playername like '%" + sbn + "%'"; 
        }
        if (agefrom != null && agefrom.length() > 0) {
            int ag = Integer.parseInt(agefrom);
            sql += " and age >= " + ag;
        }
        if (ageto != null && ageto.length() > 0) {
            int at = Integer.parseInt(ageto);
            sql += " and age <= " + at;
        }
        if (pricefrom != null && pricefrom.length() > 0) {
            int pf = Integer.parseInt(pricefrom);
            sql += " and transfer >= " + pf;
        }
        if (priceto != null && priceto.length() > 0) {
            int pt = Integer.parseInt(priceto);
            sql += " and transfer <= " + pt;
        }
        ArrayList<Player> arr = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                arr.add(new Player(rs.getInt("playerid"), rs.getInt("numberShirt"), rs.getInt("age"), rs.getInt("transfer"),
                    rs.getInt("cid"), rs.getString("playername"), rs.getString("nation")));
            }
        } catch (SQLException e) {            
        }
        return arr;        
    }
}