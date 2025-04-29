package learnscannerclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnScannerClass {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\java.txt");

        try {
            Scanner s = new Scanner(f);

            while (s.hasNext()) {
                String text = s.nextLine();
                String[] myArray = text.split(" ");
                System.out.println(Arrays.toString(myArray));
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnScannerClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
