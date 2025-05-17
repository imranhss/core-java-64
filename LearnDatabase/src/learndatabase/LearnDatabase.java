package learndatabase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import learndatabase.util.DbUtil;
import learndatabase.view.StudentAddView;

public class LearnDatabase {

    public static void main(String[] args) {

        StudentAddView addView=new StudentAddView();
        
        addView.setVisible(true);
        
    }

}
