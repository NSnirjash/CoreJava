package dbcrud3;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class DBCrud3 {
    
    public static DbUtil db = new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";
    
    public static void main(String[] args) {
//        saveData("Nirjash", "nirjash@gmail.com", "Panthapath", "01784054171");
        System.out.println("After insert");
        showData();
        updateData("Rafiqul", "rafiqul@gmail.com", "Rajabajar", "01775805206", 1);
        System.out.println("After update");
        showData();
        deleteData(3);
        System.out.println("After delete");
        showData();
        
    }
    
    public static void saveData(String name, String email, String address, String cell_no) {
        sql = "insert into student(name, email, address, cell_no) values(?,?,?,?)";
        
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
            Logger.getLogger(DBCrud3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void showData() {
        sql = "select * from student";
        
        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cell_no = rs.getString("cell_no");
                String stu_id = rs.getString("stu_id");
                
                System.out.println("Student id: " + stu_id + "\tName: " + name + "\tEmail: " + email + "\tAddress: " + address + "\tcell: " + cell_no);
            }
            
            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(DBCrud3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void updateData(String name, String email, String address, String cell_no, int stu_id) {
        sql = "update student set name=?, email=?, address=?, cell_no=? where stu_id=?";
        
        try {
            ps = db.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cell_no);
            ps.setInt(5, stu_id);
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBCrud3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void deleteData(int stu_id){
        sql = "delete from student where stu_id=?";
        
        try {
            ps = db.getCon().prepareStatement(sql);
            
            ps.setInt(1, stu_id);
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(DBCrud3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
