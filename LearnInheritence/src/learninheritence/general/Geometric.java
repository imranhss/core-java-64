
package learninheritence.general;

import java.util.Date;


public class Geometric {
    
    private String color;
    private boolean  filled;
    private Date dateCreated;

    public Geometric() {
    }

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Geometric{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }
    
    
    
}
