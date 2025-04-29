package testfilestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestFileStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try {

            FileOutputStream fos = new FileOutputStream("java.dat");

            fos.write(10);
            fos.write(50);
            fos.write(60);

            fos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestFileStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestFileStream.class.getName()).log(Level.SEVERE, null, ex);
        }

        FileInputStream fis = new FileInputStream("java.dat");

        int value;
        while ((value = fis.read()) != -1) {
            System.out.print(value + " ");
        }

    }

}
