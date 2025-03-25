package calculateareaofcircle;

import java.util.Scanner;

public class CalculateAreaOfCircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius ");

        String a="";
        
        
        int radius = input.nextInt();

//        final float PI=3.1416f;
//        
//        float result= PI * (radius*radius);
        double result = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of Circle is " + result);
        System.out.println("Area of Circle is " + Math.PI);

    }

}
