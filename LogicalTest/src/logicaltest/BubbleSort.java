package logicaltest;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Array Size ");
        int size = s.nextInt();

        int[] myArray = new int[size];

        for (int index = 0; index < myArray.length; index++) {
            System.out.println("Enter value " + (index + 1));
            int userInput = s.nextInt();
            myArray[index] = userInput;

        }
        System.out.println("------------------------------");
        System.out.println("Before Sorting " + Arrays.toString(myArray));

        for (int round = 0; round < myArray.length - 1; round++) {
            for (int step = 0; step < myArray.length - round - 1; step++) {
                if (myArray[step] > myArray[step + 1]) {
                    int temp = myArray[step];
                    myArray[step] = myArray[step + 1];
                    myArray[step + 1] = temp;

                }
            }
        }

        System.out.println("After Sorting " + Arrays.toString(myArray));

    }

}
