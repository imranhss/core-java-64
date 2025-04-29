package learnarraylist;

import java.util.ArrayList;
import java.util.Collections;
import learnarraylist.student.Student;

public class LearnArrayList {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<Student>();

        Student s = new Student("B", "b", 2);

        studentList.add(new Student("A", "a", 1));
        studentList.add(0, s);
        studentList.add(new Student("C", "c", 3));
        studentList.add(new Student("D", "d", 4));

        //System.out.println(studentList);
//        for(Student student : studentList){
//            System.out.println(student);        
//        }
        // studentList.remove(s);

        for (int index = 0; index < studentList.size(); index++) {
            System.out.println(studentList.get(index).getName());
        }

//        ArrayList<Integer> numberList = new ArrayList<>();
//
//        numberList.add(10);
//        numberList.add(90);
//        numberList.add(30);
//        numberList.add(100);
//
//        Collections.sort(numberList);
//
//        System.out.println(Collections.max(numberList));
//
//        for (int i : numberList) {
//            System.out.println(i);
//        }

    }

}
