package learnclassandobject;

import java.util.Scanner;
import learnclassandobject.lclass.Circle;
import learnclassandobject.lclass.Student;

public class LearnClassAndObject {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Reja pls enter Marks ");
        int rejaMarks=s.nextInt();
        
        System.out.println("Atik pls enter Marks ");
        int atikMarks=s.nextInt();
        
        System.out.println("Imran pls enter Marks ");
        int imranMarks=s.nextInt();
        

        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(4);
        Circle c4 = new Circle(5);
        
        Student reja=new Student("Reja");
        Student atik=new Student("Atik");
        Student imran=new Student("Imran");
        
        reja.setMarks(rejaMarks);
        atik.setMarks(atikMarks);
        imran.setMarks(imranMarks);
        
        
        System.out.println(reja.getResult());
        System.out.println(atik.getResult());
        System.out.println(imran.getResult());

//        System.out.println(c1.getArea());
//        System.out.println(c1.getPerimeter());
//
//        
//
//        System.out.println(c2.getArea());
//        System.out.println(c2.getPerimeter());
//        
//        System.out.println(c3.getArea());
//        System.out.println(c3.getPerimeter());
//        
//        
//        System.out.println(c4.getArea());
//        System.out.println(c4.getPerimeter());
  

    }

}
