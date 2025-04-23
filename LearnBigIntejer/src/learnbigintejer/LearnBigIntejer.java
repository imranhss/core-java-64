package learnbigintejer;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class LearnBigIntejer {

    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter Value ");
//
//        int userInput = s.nextInt();
//
//         BigInteger factorial = BigInteger.ONE;
//        // BigInteger factorial = new BigInteger("10");
//
//        //BigInteger factorial = BigInteger.valueOf(10);
//        for (int i = 1; i <= userInput; i++) {
//
//            factorial = factorial.multiply(BigInteger.valueOf(i));
//        }
//
//        System.out.println(factorial);
//        
//        
//        char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
//        String message = new String(charArray);
        String s = "Java";
        s = "Hazaribag, Dhaka is known for its leather industry.";

        System.out.println(Arrays.toString(s.split(",")));

        System.out.println("440-02-454".matches("\\d{3}-\\d{2}-\\d{4}"));

        
        
        
        
        String ss = String.format("%7.2f%6d%-2s", 45.556, 14355, "AB");
        System.out.println(ss);
        
        StringBuilder builder=new StringBuilder("I like Java");
        
        System.out.println(builder.reverse());

    }

}
