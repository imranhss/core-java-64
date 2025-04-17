package learnmethodoverloading;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Limit ");
        int n = s.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];

        
        for (int index=0; index < names.length; index++) {
                System.out.println("Enter Name ");
                String name=s.next();
                names[index]=name;
                
                System.out.println("Enter Marks ");
                int mark=s.nextInt();
                marks[index]=mark;     
            
        }
        
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(marks));

       

        for (int index = 0; index < names.length; index++) {

            System.out.println("My name is " + names[index] + " and marks is " + marks[index]);
        }

    }

}
