package learnscannerclass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadDataFromWeb {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.google.com/index.html");
            Scanner scanner = new Scanner(url.openStream());

            // Pattern to match HTML tags
            Pattern pattern = Pattern.compile("<[^>]+>");

            while (scanner.hasNext()) {
                String s = scanner.nextLine();

                Matcher matcher = pattern.matcher(s);

                // Find and print all HTML tags in the line
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
            }

            scanner.close(); // Close scanner after use
        } catch (MalformedURLException ex) {
            Logger.getLogger(ReadDataFromWeb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadDataFromWeb.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
