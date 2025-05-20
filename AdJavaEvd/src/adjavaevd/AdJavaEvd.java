package adjavaevd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class AdJavaEvd {

    static DbUtil du = new DbUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {

        saveEmp("Reja", "reja@gmail.com", 20000f);
        System.out.println("After Save");
        showALlEmp();
        System.out.println("-------------------------");

        UpdateEmp("C M Reja", "reja@gmail.com", 50000f, 1);
        System.out.println("After Update");
        showALlEmp();
        System.out.println("-------------------------");
        
        

        deleteEmp(2);
        System.out.println("After Delete");
        showALlEmp();
        
        System.out.println("-------------------------");
    }

    public static void saveEmp(String name, String email, float salary) {
        sql = "insert into emp(name, email, salary) values(?,?,?)";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, salary);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();
            System.out.println("Data Save");
            System.out.println("------------------------------");
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showALlEmp() {
        sql = "select * from emp";
        try {
            ps = du.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                float salary = rs.getFloat("salary");
                System.out.println("ID: " + id + " Name: " + name + " Email: "
                        + email + " Salary: " + salary);

            }

            rs.close();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteEmp(int id) {

        sql = "delete from emp where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void UpdateEmp(String name, String email, float salary, int id) {
        sql = "update emp set name=?, email=?, salary=? where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, salary);
            ps.setInt(4, id);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
