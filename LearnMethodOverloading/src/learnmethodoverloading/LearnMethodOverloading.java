package learnmethodoverloading;

import java.util.Arrays;
import java.util.Scanner;

public class LearnMethodOverloading {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter How many number u want to input ");
        int n = s.nextInt();

        int[] myArray=new int[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Enter the number ");
            int userInput = s.nextInt();
            
            myArray[i]=userInput;
        }       
        
        sum(myArray);

    }

    public static int sum() {

        return 10 + 20;
    }

    public static int sum(int a) {

        return 10 + a;
    }

    public static int sum(int a, int b) {

        return b + a;
    }

    public static void sum(int... a) {

        int sum = 0;

        for (int item : a) {
            sum += item;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(sum);

    }

}
