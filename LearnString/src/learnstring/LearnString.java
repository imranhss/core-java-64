package learnstring;

import java.util.Scanner;

public class LearnString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your Name ");
        String message = s.nextLine();

        int a = 10;

//        System.out.println("Length = "+message.length());
//       // System.out.println("Char  AT  = "+message.charAt(16-1));
//        System.out.println("Concate  = "+message.concat("123"));
//        System.out.println("Upper  = "+message.toUpperCase());
//        System.out.println("Lower  = "+message.toLowerCase());
//        System.out.println("Trim  ="+message.trim());
//        System.out.println("equals " + message.equals("Message"));
//        System.out.println("equalsIgnoreCase " + message.equalsIgnoreCase("Message"));
//        System.out.println("compareTo " + message.compareTo("Message"));
//        System.out.println("compareToIgnoreCase " + message.compareToIgnoreCase("Message"));
//        System.out.println("startsWith " + message.startsWith("Mes"));
//        System.out.println("endsWith " + message.endsWith("ge"));
//        System.out.println("contains " + message.contains("G"));
        //System.out.println("Sub String  " + message.substring(2, 5));

        
        System.out.println("Welcome to Java".lastIndexOf("to", 8));
    
        System.out.println("The Value of Pi is "+Math.PI);
        System.out.printf("The Value of Pi is %4.4f \n",Math.PI);
        
        System.out.printf("Atik's %d age is \n", 25);
        System.out.printf("Atik's %s age is \n", "Java");
    
    }

}
