package logicaltest;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumberInArray {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter limit ");
        int size = s.nextInt();

        findMaxMinNumber(size);

        
    }

//    public static String findMaxMinNumber(int size) {
//
//        int[] numbers = new int[size];
//
//        System.out.println("My Numbers are " + Arrays.toString(numbers));
//
//        for (int index = 0; index < size; index++) {
//
//            System.out.println("Enter number " + (index + 1));
//            int userInput = s.nextInt();
//            numbers[index] = userInput;
//
//            //  [10, 50, 0, 0, 0, 0]
//        }
//
//        System.out.println("My Numbers are " + Arrays.toString(numbers));
//
//        int maxNumber = numbers[0];
//        int minNumber = numbers[0];
//
//        // [90, 10, 50, 20, 60, 30]
//        for (int number : numbers) {
//
//            if (number > maxNumber) {
//                maxNumber = number;
//            }
//
//            if (number < minNumber) {
//                minNumber = number;
//            }
//
//        }
//
//        String message = "Max Number is "
//                + maxNumber + "\n"
//                + "Min Number is "
//                + minNumber;
//
//        return message;
//
//    }
    public static void findMaxMinNumber(int size) {

        int[] numbers = new int[size];

        System.out.println("My Numbers are " + Arrays.toString(numbers));

        for (int index = 0; index < size; index++) {

            System.out.println("Enter number " + (index + 1));
            int userInput = s.nextInt();
            numbers[index] = userInput;

            //  [10, 50, 0, 0, 0, 0]
        }

        System.out.println("My Numbers are " + Arrays.toString(numbers));

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        // [90, 10, 50, 20, 60, 30]
        for (int number : numbers) {

            if (number > maxNumber) {
                maxNumber = number;
            }

            if (number < minNumber) {
                minNumber = number;
            }

        }

        System.out.println("Max Number is " + maxNumber);
        System.out.println("Min Number is " + minNumber);

    }

}
