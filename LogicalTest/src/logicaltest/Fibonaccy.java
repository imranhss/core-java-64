
package logicaltest;

import java.util.Scanner;


public class Fibonaccy {
    
    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter limit :");
        int size = s.nextInt();
        System.out.println("-------------------------------");
        
        int number1=0;
        int number2=1;
        int sum=0;
        System.out.println(number1);
        System.out.println(number2);
        
        for(int i=3; i<=size; i++){
            sum= number1+number2;
            System.out.println(sum);
            
            number1 = number2;
            number2 = sum;        
        }
        
        
        
        
    }
    
    
    
}
