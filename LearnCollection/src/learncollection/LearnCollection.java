package learncollection;

import java.util.*;


public class LearnCollection {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
        List<String> list2 = Arrays.asList("yellow", "red", "green", "blue");
        
        Collections.shuffle(list1, new Random(2));
        //Collections.shuffle(list2, new Random(20));
        
        Collections.sort(list2);
        
        
       
        System.out.println(list1);
        System.out.println(list2);

    }

}
