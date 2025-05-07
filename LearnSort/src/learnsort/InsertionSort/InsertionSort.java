package learnsort.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String[] args) {
        
        
        int[] numbers= {50,10,20,5,8};
        
        insertionSort(numbers);
        
    }
    
    public static void insertionSort(int[] list) {
        
        for (int i = 1; i < list.length; i++) {
           
            int currentElement = list[i];
            int k;
            // {50,10,20,5,8}
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
                
            }
            
            list[k + 1] = currentElement;
        }
        
        System.out.println(Arrays.toString(list));
    }
}
