
package learninheritence;

import learninheritence.spe.Circle;
import learninheritence.spe.Rectangle;


public class LearnInheritence {

 
    public static void main(String[] args) {
       
            Circle c=new Circle(1);
            
            Rectangle r=new Rectangle(2,5);
            r.setColor("Red");
            
            System.out.println(c.toString());
            
            System.out.println(c.getColor());
            System.out.println(c.getRadius());
            System.out.println(c.getArea());
            System.out.println(c.getDiameter());
            
            
            
            System.out.println("---------------------------");
                    System.out.println(r.toString());
                    System.out.println(r.getArea());
                    System.out.println(r.getPerimeter());
                    
             
        
    }
    
}
