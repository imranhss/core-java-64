package learnaccessmodifier;

import java.util.Scanner;
import learnaccessmodifier.mobil.AndroidMobile;
import learnaccessmodifier.student.Student;

public class LearnAccessModifier {

    public static void main(String[] args) {

        AndroidMobile am = new AndroidMobile();

//        am.printDetails();
        Student s = new Student();

        s.setName("Reja");
        s.setEmail("reja@gmail.com");
//        s.setId(123546);

        s.printStudentDetails();
//        Scanner s1 = new Scanner(System.in);
//        System.out.println("enter value");
//
//        int userIput = s1.nextInt();
//        int sum = 0;
//        while (userIput > 0) {
//
//            sum += userIput;
//            
//            System.out.println("enter value");
//            userIput = s1.nextInt();
//
//        }
//
//        System.out.println("Sum= " + sum);

        Student student = new Student();
        student.setName("Atik Islam");
        student.setId(15456451);
        
        
        printStudentDetails(student);

    }

    public static void printStudentDetails(Student student) {
        System.out.println("Name :" + student.getName() + "\n"
                + "ID: " + student.getId()
        );

    }

}
