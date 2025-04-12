package calculateareaofcircle;

import java.util.Scanner;

public class AreaOfCircleWithIf {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double areaOfCircle=1;

        System.out.println("Enter radius of Circle");
        double radius = s.nextDouble();

        boolean status = false;
        int count=2;

        while (status == false && count<=3) {

            if (radius <= 0) {

                System.out.println("Pls Enter More than 0(Zero)");                
                radius = s.nextDouble();    
                count++;
                status = false;

            } else {
                areaOfCircle = Math.PI * Math.pow(radius, 2);
                status = true;
            }

        }

        System.out.println("Area of Circle is " + areaOfCircle);

//        if (radius <= 0) {            
//            
//            System.out.println("Pls Enter More than 0(Zero)");     
//
//            radius = s.nextDouble();
//
//            areaOfCircle = Math.PI * Math.pow(radius, 2);
//
//        } else {
//            areaOfCircle = Math.PI * Math.pow(radius, 2);
//
//        }
//        
//        System.out.println("Area of Circle is "+ areaOfCircle);
    }

}
