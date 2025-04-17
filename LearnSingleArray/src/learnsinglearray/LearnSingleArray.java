
package learnsinglearray;

import java.util.Arrays;


public class LearnSingleArray {

   
    public static void main(String[] args) {
        
        String[] names=new String[14];
        int[] marks=new int[14];        
        int[] ages={20,25,25,24,24,20,15,26};
        
        System.out.println(Arrays.toString(names));
        
        names[0]="Istiaq";
        names[3]="Masud";
        names[13]="Imran";
        
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(ages));
        
        System.out.println(ages[2]);
        
    }
    
}
