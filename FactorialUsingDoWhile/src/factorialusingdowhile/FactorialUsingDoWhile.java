
package factorialusingdowhile;

import java.util.Scanner;


public class FactorialUsingDoWhile {

   
    public static void main(String[] args) {
       
           Scanner s=new Scanner(System.in);
           
           int input;
           int count = 1;           
           long factoril=1;
           
           System.out.println("Enter value ");
           input=s.nextInt();
           
           if(input<0){
               System.out.println(" Enter positive number ");
           }
           else{
           
                do{
                    factoril *=count;
                    count++;
                    
                }
                while(count <= input );               
           
           }
           
           System.out.println("Factorial is " + factoril);
      
        
    }
    
}
