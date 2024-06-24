package dbcrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class DBCrud {

    public static DbUtil db = new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static void main(String[] args) {
        System.out.println("After insert data");

        saveData("Nirob", "nirob@gmail.com", "Mohammadpur", "123456789");

        showData();

        updateData("Razu", "razu@gmail.com", "Panthapath", "987456321", 5);

        System.out.println("\nAfter update");
        showData();
        
        deleteData(1);
        System.out.println("After delete");
        showData();
    }

    public static void saveData(String name, String email, String address, String cell_no) {
        sql = "insert into employee(name, email, address, cell_no) values(?,?,?,?)";

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
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showData() {
        sql = "select* from employee";

        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cell_no = rs.getString("cell_no");
                String emp_id = rs.getString("emp_id");

                System.out.println("Emp_id: " + emp_id + "\tName: " + name + "\tEmail: " + email + "\tAddress: " + address + "\tcell: " + cell_no);
            }

            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateData(String name, String email, String address, String cell_no, int emp_id) {
        sql = "update employee set name=?, email=?, address=?, cell_no=? where emp_id=?";
        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cell_no);
            ps.setInt(5, emp_id);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteData(int emp_id) {
        sql = "delete from employee where emp_id=?";

        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, emp_id);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
