package learninheritence.spe;

import learninheritence.general.Geometric;

public class Circle extends Geometric {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {

        return 2 * Math.PI * radius;
    }

    public double getDiameter() {

        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated()
                + " and the radius is " + radius);
    }

}
