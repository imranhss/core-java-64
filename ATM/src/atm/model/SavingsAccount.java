package atm.model;

public class SavingsAccount extends Account {

    private final double MIN_BALANCE = 500;

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);

    }

    @Override
    public void withdraw(double amount) {

        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Minimum balance required: " + MIN_BALANCE);
        }
    }

}
