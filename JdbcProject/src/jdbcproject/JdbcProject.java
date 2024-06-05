package jdbcproject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class JdbcProject {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {
        DbUtil db = new DbUtil();

        String insertSql = "insert into student(name, email, address, cel) values(?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(insertSql);

            ps.setString(1, "Nirjash");
            ps.setString(2, "nirjash@gmail.com");
            ps.setString(3, "Panthapath, Dhaka");
            ps.setString(4, "01784054171");
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(JdbcProject.class.getName()).log(Level.SEVERE, null, ex);
        }

        String selectSql = "select * from student";

        try {
            ps = db.getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cel = rs.getString("cel");
                
                System.out.println("id: "+id+" Name: "+name+" Email: "+email+" Address: "+address+"Contact: "+cel);
            }

            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(JdbcProject.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
