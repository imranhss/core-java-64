package atm;

import atm.model.SavingsAccount;
import atm.service.AccountUtil;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        AccountUtil account = new SavingsAccount("4555", 500);
        int choice = 0;
        
        do{
            System.out.println("Welcome \n"
                    + "For Withdraw Press 1\n"
                    + "For Deposite Press 2\n"
                    + "For Check Balance Press 3\n"
                    + "For Exit Press 4\n"
                    );
        
            choice = s.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter Amount");
                    account.withdraw(s.nextDouble());
                    
                    break;
                    
                case 2:
                    System.out.println("Enter Amount");
                    account.deposit(s.nextDouble());                    
                    break;
                    
                case 3:
                    System.out.println("Enter Amount");
                    account.checkBalance();                    
                    break;
                case 4:
                    System.out.println("Thanks ");
                    s.close();
                    break;
                    
                default:
                    System.out.println("Invalied Choice");;
            }
            
            
        
        }while( choice != 4);
        

    }

}
