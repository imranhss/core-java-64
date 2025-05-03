package datainputstreamtest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataInputStreamTest {

    public static void main(String[] args) {

        try ( // Create an output stream for file temp.dat
                DataOutputStream output
                = new DataOutputStream(new FileOutputStream("temp.dat"));) {
            // Write student test scores to the file
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        } catch (IOException ex) {
            Logger.getLogger(DataInputStreamTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        try ( // Create an input stream for file temp.dat
                DataInputStream input
                = new DataInputStream(new FileInputStream("temp.dat"));) {
            // Read student test scores from the file
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        } catch (IOException ex) {
            Logger.getLogger(DataInputStreamTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
