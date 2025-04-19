package learnmultildimnetionalarray;

import java.util.Scanner;

public class D2ArrayPractice {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Row Number ");
        int rowNumber = s.nextInt();

        System.out.println("Enter Column Number ");
        int columnNumber = s.nextInt();
        
        int[][] myArrays = new int[rowNumber][columnNumber];

        for (int row = 0; row < myArrays.length; row++) {

            for (int col = 0; col < myArrays[row].length; col++) {
                System.out.println("Enter item value ");
                int userInput = s.nextInt();
                myArrays[row][col] = userInput;

            }
        }
        
        System.out.println("--------------------------------");
        
         for(int row=0; row < myArrays.length; row++){
        
            for(int col=0; col< myArrays[row].length; col++){
                
                System.out.print(myArrays[row][col]+ "\t");            
            }  
            
            System.out.println("\n");
            
        }

    }

}
