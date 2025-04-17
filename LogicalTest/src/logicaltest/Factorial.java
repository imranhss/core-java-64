
package logicaltest;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number :");
        int input = s.nextInt();
        int factorial=1;
        
        for(int i=1; i<=input; i++){
        
            factorial *= i;
        
        }
        
        System.out.println("Factorial of "+ input + " is "+ factorial);
        
        
    }
}
