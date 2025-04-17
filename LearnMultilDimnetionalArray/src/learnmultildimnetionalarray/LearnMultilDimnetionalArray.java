
package learnmultildimnetionalarray;

import java.util.Arrays;


public class LearnMultilDimnetionalArray {

   
    public static void main(String[] args) {
      
        int[][] myArrays=new int[2][3];       
        
        
        System.out.println(Arrays.deepToString(myArrays));
        
        myArrays[0][1]=5;
        myArrays[1][1]=8;
        myArrays[1][0]=8;
        
        System.out.println(Arrays.deepToString(myArrays));
        
        
        for(int row=0; row < myArrays.length; row++){
        
            for(int col=0; col< myArrays[row].length; col++){
                
                System.out.print(myArrays[row][col]);            
            }  
            
            System.out.println("\n");
            
        }
        
    }
    
}
