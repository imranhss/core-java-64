package logicaltest;

import java.util.Arrays;
import java.util.Scanner;

public class LogicalTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter limit ");
        int size = s.nextInt();

        int[] numbers = new int[size];

        int maxNumber = 0;  // numbers[0]
        int minNumber = 999999999; // numbers[0]

        for (int index = 0; index < size; index++) {

            System.out.println("Enter number " + (index + 1));
            int userInput = s.nextInt();
            numbers[index] = userInput;

        }

        System.out.println("My Numbers are " + Arrays.toString(numbers));

        // [10, 50, 20, 60, 30]
        
        for (int number : numbers) {
            
            if (number > maxNumber) {
                maxNumber = number;
            }
            
            if(number < minNumber){
                minNumber = number;
            }

        }
                
        System.out.println("Max Number is "+ maxNumber);
        System.out.println("Min Number is "+ minNumber);

    }

}
