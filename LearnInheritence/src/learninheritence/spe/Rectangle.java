package learninheritence.spe;

import java.util.Date;
import learninheritence.general.Geometric;

public class Rectangle extends Geometric {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {

        return width * height;
    }

    public double getPerimeter() {
        
        
        return 2 * (width + height);
    }
    
    @Override
    public void setColor(String color) {
        super.setColor(color); 
        
        
    }

    
    

    

}
