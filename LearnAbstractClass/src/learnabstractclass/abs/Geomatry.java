package learnabstractclass.abs;

import java.util.Date;

public abstract class Geomatry {

    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public Geomatry() {
        dateCreated = new Date();
    }

    public Geomatry(boolean filled, Date dateCreated) {
        this.filled = filled;
        this.dateCreated = dateCreated;
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

    public abstract double getArea();

    public abstract double getPerimeter();

}
