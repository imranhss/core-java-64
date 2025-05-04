package testarrayandlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayAndLinkedList {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student a = new Student("A", "a", 1);

        students.add(a);
        students.add(new Student("B", "b", 2));
        students.add(new Student("C", "c", 3));
        students.add(new Student("D", "d", 4));

//        for (int index = 0; index < students.size(); index++) {
//
//            System.out.println("Name: " + students.get(index).getName());
//            System.out.println("Email: " + students.get(index).getEmail());
//            System.out.println("ID: " + students.get(index).getId());
//
//            System.out.println("-----------------------------");
//
//        }
//
//        students.remove(a);
//        System.out.println("After remove ");
//
//        for (int index = 0; index < students.size(); index++) {
//
//            System.out.println("Name: " + students.get(index).getName());
//            System.out.println("Email: " + students.get(index).getEmail());
//            System.out.println("ID: " + students.get(index).getId());
//
//            System.out.println("-----------------------------");
//
//        }

        LinkedList<Student> stuList = new LinkedList<>();

        stuList.add(a);
        stuList.add(new Student("B", "b", 2));
        stuList.add(new Student("C", "c", 3));
        stuList.add(new Student("D", "d", 4));
        
        ListIterator<Student> it=stuList.listIterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        
        }
        

    }

}
