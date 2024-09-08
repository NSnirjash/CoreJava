package dbcrud4;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class DBCrud4 {

    public static DbUtil db = new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static void main(String[] args) {
//        saveData("Nirjash", "nirjash@gmail.com", "Panthapath", "01784054171");
        System.out.println("After insert");
        showData();
        updateData("Nirob", "nirob@gmail.com", "Mohammmadpur", "12345678901", 2);
        System.out.println("After Update");
        showData();
        deleteData(3);
        
        System.out.println("After Delete");
        showData();

    }

    public static void saveData(String name, String email, String address, String cell_no) {
        sql = "insert into trainee(name, email, address, cell_no) values(?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cell_no);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud4.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showData() {
        sql = "select* from trainee";

        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cell_no = rs.getString("cell_no");
                String id = rs.getString("id");

                System.out.println("ID: " + id + "\tName: " + name + "\tEmail: " + email + "\tAddress: " + address + "\tCell: " + cell_no);
            }
            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(DBCrud4.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateData(String name, String email, String address, String cell_no, int id) {
        sql = "update trainee set name=?, email=?, address=?, cell_no=? where id=?";

        try {
            ps = db.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cell_no);
            ps.setInt(5, id);
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(DBCrud4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static void deleteData(int id) {
        sql = "delete from trainee where id=?";
        
        try {
            ps = db.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBCrud4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
