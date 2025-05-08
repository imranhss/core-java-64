
package learncollection.stack;

import java.util.Stack;


public class TestStack {
    
    public static void main(String[] args) {
        
        Stack<String> namesStack=new Stack<>();
        
        namesStack.push("Atik");
        namesStack.push("Imran");
        namesStack.push("Sathe");
        
        System.out.println(namesStack);
       // System.out.println(namesStack.peek());
        // namesStack.pop();
        
         System.out.println(namesStack.search("Atik"));
        
        
         System.out.println(Float.floatToIntBits(2f));
         System.out.println(Float.floatToIntBits(100f));
         
          int hashCode = (int)(2 ^ (2 >> 32));
          
          System.out.println(hashCode);
          
          
         
        
    }
    
}
