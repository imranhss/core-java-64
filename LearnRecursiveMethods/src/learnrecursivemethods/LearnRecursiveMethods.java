package learnrecursivemethods;

import learnrecursivemethods.methods.Fibonaccisequence;
import learnrecursivemethods.methods.Palindrome;
import learnrecursivemethods.methods.TowerOfHanoi;

public class LearnRecursiveMethods {

    public static void main(String[] args) {

       // System.out.println( factorial(8));
        
        
        Fibonaccisequence  f=new Fibonaccisequence();
        Palindrome p=new Palindrome();
        
        TowerOfHanoi hanoi=new TowerOfHanoi();
        
       hanoi.towerOfHanoi(8, 'A', 'B', 'C');
        
        // System.out.println(p.isPalindrome(478));
                
        
      //  System.out.println(f.fibonacci(7));
    }

    public static long factorial(int n) {
        if (n == 0)// Base case
        {
            return 1;
        } else {
           // System.out.println(n);
            return n * factorial(n - 1);// Recursive call
        }
    }

}
