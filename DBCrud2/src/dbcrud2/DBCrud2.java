package dbcrud2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class DBCrud2 {

    public static DbUtil db = new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static void main(String[] args) {
        saveData("Nirjash", "nirjash@gmail.com", "Panthapath", "30000", "01784054171");
        System.out.println("After insert");
        showData();
        updateData("Neyamul", "neyamul@gmail.com", "Mohammadpur", "35000", "123456778901", 1);
        System.out.println("After Update");
        showData();
        deleteData(3);
        deleteData(4);
        deleteData(5);
        System.out.println("After Delete");
        showData();

    }

    public static void saveData(String name, String email, String address, String salary, String contact) {
        sql = "insert into teacher(name, email, address, salary, contact) values(?,?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, salary);
            ps.setString(5, contact);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showData() {

        sql = "select * from teacher";

        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String salary = rs.getString("salary");
                String contact = rs.getString("contact");
                String teacher_id = rs.getString("teacher_id");

                System.out.println("Teacher ID: " + teacher_id + "\tName: " + name + "\tEmail: " + email + "\tAddress: " + address + "\tSalary: " + salary + "\tContact: " + contact);
            }

            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateData(String name, String email, String address, String salary, String contact, int teacher_id) {
        sql = "update teacher set name=?, email=?, address=?, salary=?, contact=? where teacher_id=?";

        try {
            ps = db.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, salary);
            ps.setString(5, contact);
            ps.setInt(6, teacher_id);
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void deleteData(int teacher_id){
        sql = "delete from teacher where teacher_id=?";
        
        try {
            ps = db.getCon().prepareStatement(sql);
            
            ps.setInt(1, teacher_id);
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(DBCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
