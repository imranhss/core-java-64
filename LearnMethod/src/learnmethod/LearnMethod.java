package learnmethod;

import java.util.Scanner;

public class LearnMethod {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        System.out.println("Enter First no ");
//        int atk = s.nextInt();
//        System.out.println("Enter 2nd no ");
//        float rj = s.nextFloat();
//        System.out.println("Enter 3rd no ");
//        double im = s.nextDouble();

        System.out.println("Enter number to check Prime or not Prime ");
        int userIput = s.nextInt();
        
        String result=findPrimeNumber(userIput);

        //float result = doSum(atk, rj, im);
        System.out.println(result);

    }

    public static float doSum(int num1, float num2, double num3) {

        float result = (float) (num1 + num2 + num3);

        return result;
    }

    public static String findPrimeNumber(int input) {

        int count = 0;
        String result = "";

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            result = input + " it is Prime Number ";
        } else {
            result = input + " it is Not Prime Number ";
        }
        return result;
    }

}
