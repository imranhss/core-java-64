/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooppractice.q2;

/**
 *
 * @author Admin
 */
public class Bike extends Vehicle {

    private boolean hasCarrier;

    public Bike() {
    }

    public Bike(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public Bike(boolean hasCarrier, String brand, int speed) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    void displayBikeDetails() {
        displayVehicleDetails();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }

}
