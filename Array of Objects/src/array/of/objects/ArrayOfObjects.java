package array.of.objects;

import array.of.objects.student.Student;
import java.util.Arrays;

public class ArrayOfObjects {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        Student atik = new Student("Atik ISlam ", "atik@gmail.com", 123456789);
        Student masud = new Student("Masud Khan", "masud@gmail.com", 987654321);
//        Student reja=new Student("Reja", "reja@gmail.com", 123456789);
        Student reja = new Student();
        
        reja.setName("Reja");
        reja.setEmail("reja@gmail.com");
        reja.setId(123456789);
        

        students[0] = atik;
        students[1] = masud;
        students[2] = reja;

        System.out.println(Arrays.toString(students));

    }

}
