package testexception.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbUtil {

    private Connection con = null;
    private String url = "";
    private String user = "root";
    private String password = "1234";
    private String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getCon() {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return con;

    }
    
    
    
//    public Connection getCon() throws ClassNotFoundException, SQLException {
//
//        
//            Class.forName(driver);
//            con = DriverManager.getConnection(url, user, password);
//
//        
//        return con;
//
//    }

}
