
package testexception;

import java.sql.SQLException;
import testexception.util.DbUtil;


public class TestException {

  
    public static void main(String[] args)  {
        
        
        
        DbUtil dbUtil=new DbUtil();
        
        dbUtil.getCon();
        
        
        
    }
    
}
