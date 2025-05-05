/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooppractice.account;

/**
 *
 * @author Admin
 */
public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount() {
    }

    public CurrentAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(double overdraftLimit, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {

        double balance = super.getBalance();

        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            
            super.setBalance(balance);
            
            System.out.println(amount + " withdrawn successfully (with overdraft if needed).");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit or invalid amount.");
        }
    }

    // Override to display Current Account details
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }

}
