
package learnabstractclass.geoobj;

import java.io.Serializable;
import java.util.Date;
import learnabstractclass.abs.Geomatry;


public class Circle extends Geomatry implements Cloneable, Comparable<Circle>{
    
    private double  radius;

    public Circle() {
    }

    public Circle(boolean filled, Date dateCreated) {
        super(filled, dateCreated);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    

    @Override
    public double getArea() {
        
        return Math.PI* Math.pow(radius, 2);
        
    }

    @Override
    public double getPerimeter() {
        System.out.println("---------------");
        System.out.println(super.getDateCreated());
        
        return 2* Math.PI* radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
   
   
    
}
