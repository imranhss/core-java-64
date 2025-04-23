package learnbigintejer;

import java.math.BigInteger;
import java.util.Scanner;

public class LearnBigIntejer {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Value ");

        int userInput = s.nextInt();

         BigInteger factorial = BigInteger.ONE;
        // BigInteger factorial = new BigInteger("10");

        //BigInteger factorial = BigInteger.valueOf(10);
        for (int i = 1; i <= userInput; i++) {

            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);

    }

}
