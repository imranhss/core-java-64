
package testexception.exc;


public class InvalidRadiusExc extends Exception{
    
    private double radius; 

    public InvalidRadiusExc(double radius) {
        this.radius = radius;
    }

    public InvalidRadiusExc(double radius, String message) {
        super(message);
        this.radius = radius;
    }

    public InvalidRadiusExc(double radius, String message, Throwable cause) {
        super(message, cause);
        this.radius = radius;
    }

    public InvalidRadiusExc(double radius, Throwable cause) {
        super(cause);
        this.radius = radius;
    }

    public InvalidRadiusExc(double radius, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.radius = radius;
    }
       
    
}
