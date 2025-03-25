
package convertminutes;

import java.util.Scanner;

public class ConvertMinutes {

   
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);        
        System.out.println("Enter Seconds ");
        
        int totalSeconds=scanner.nextInt();
        
        int hours = totalSeconds / 3600; // 1 hour = 3600 seconds
        int remainingSeconds = totalSeconds % 3600; // Remaining seconds after extracting hours

        int minutes = remainingSeconds / 60; // 1 minute = 60 seconds
        int seconds = remainingSeconds % 60; // Remaining seconds after extracting minutes

        System.out.println(totalSeconds + " seconds = " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
        
        
        
        
        
        
        
    }
    
}
