package learnfileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnFileClass {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\java.txt");

        try {
            //        System.out.println(f.exists());
//        System.out.println(f.length());
//        System.out.println(f.canRead());
//        System.out.println(f.canWrite());
//        System.out.println(f.lastModified());
//        System.out.println(f.isHidden());

            PrintWriter pw = new PrintWriter(f);
            
            pw.print("I am student of Java ");
            pw.print(" gfhghfga ");
            pw.print("I am student of Java ");
          
            
            pw.close();
            
        } catch (FileNotFoundException ex) {
            //System.out.println(ex);
            Logger.getLogger(LearnFileClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
