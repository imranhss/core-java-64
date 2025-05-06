package learncollection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.text.html.HTMLDocument;

public class TestMap {

    public static void main(String[] args) {

        Map<Integer, String> stuDetails = new HashMap<>();

        stuDetails.put(1, "Atik");
        stuDetails.put(2, "Imran");
        stuDetails.put(3, "Reza");
        stuDetails.put(4, "Rakib");

        System.out.println(stuDetails);

//        System.out.println("--------------------");
//        stuDetails.put(5, "Sadiar");
//        
//        System.out.println(stuDetails);
//        
//        System.out.println(stuDetails.get(2));
        Map<Integer, Student> stuList = new HashMap<>();

        stuList.put(1, new Student(1, "A", "a"));
        stuList.put(2, new Student(2, "B", "b"));
        stuList.put(3, new Student(3, "C", "c"));
        stuList.put(4, new Student(4, "D", "d"));

        System.out.println(stuList);

        Iterator<Map.Entry<Integer, Student>> li = stuList.entrySet().iterator();
        
        while (li.hasNext()) {
            Map.Entry<Integer, Student> entry = li.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }

}
