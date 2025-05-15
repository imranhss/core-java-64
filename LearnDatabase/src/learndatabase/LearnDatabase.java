package learndatabase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import learndatabase.util.DbUtil;

public class LearnDatabase {

    public static void main(String[] args) {

        DbUtil du = new DbUtil();

        String sql = "insert into students(name, email, contactNo) values(?,?,?)";

        try {
            PreparedStatement ps = du.getCon().prepareStatement(sql);

            ps.setString(1, "Reza");
            ps.setString(2, "Reza@gmail.com");
            ps.setString(3, "45645456456");

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

            System.out.println("Done");

        } catch (SQLException ex) {
            Logger.getLogger(LearnDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql1 = "select * from students";

        try {
            PreparedStatement ps = du.getCon().prepareStatement(sql1);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                String name = rs.getString("name");
                String email = rs.getString("email");
                String contactNo = rs.getString("contactNo");

                System.out.println("Name: " + name + " Email " + email + " Contact Number " + contactNo);

            }
            
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(LearnDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
