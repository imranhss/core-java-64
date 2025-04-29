package learnabstractclass;

import learnabstractclass.abs.Geomatry;
import learnabstractclass.geoobj.Chicken;
import learnabstractclass.geoobj.Circle;
import learnabstractclass.geoobj.Edible;
import learnabstractclass.geoobj.Student;

public class LearnAbstractClass {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        
        Student s1=new Student("Apple");
        Student s2= s1;
        
        
        
        System.out.println(s2);

        Edible e = new Chicken();

        Chicken c = new Chicken();

        //System.out.println(e.howToEat());

        Geomatry gCircle = new Circle(5);

        //System.out.println(gCircle.getArea());

        //System.out.println(gCircle.getDateCreated());

    }

}
