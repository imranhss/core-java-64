
package learncollection.set;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class TestSet {
    public static void main(String[] args) {
        
        Set<String> names=new TreeSet<>();
        
        names.add("Atik");
        names.add("Imarn");
        names.add("Atik");
        names.add("Masud");
        names.add("Reja");
        names.add("Imarn");
        
        
        System.out.println(names);
        
//        TreeSet<String> tSet=new TreeSet<>(names);
//        
//        System.out.println(tSet.first());
//        System.out.println(tSet.last());
//        System.out.println(tSet.floor("Masud"));
//        System.out.println(tSet.ceiling("Imran"));
//       
        
        
        Set<Integer> numbers=new HashSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(60);
        
      //  System.out.println(numbers);
        
        TreeSet<Integer> tSet=new TreeSet<>(numbers);
      
        
//       System.out.println(tSet.first());
//        System.out.println(tSet.last());
        System.out.println("less than "+tSet.lower(5));
        System.out.println("greater than "+tSet.higher(5));
        System.out.println("less than or equal "+tSet.floor(40));
        System.out.println("greater than or equal "+tSet.ceiling(21));
        
    }
}
