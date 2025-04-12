package calculateinterest;

import java.util.Scanner;


public class CalculateInterest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Interest rate Like as 12.5% ");
        double interestRate = s.nextDouble();

        double monthlyInterestRate = interestRate / 1200;

        System.out.println("Enter Nnumber of Year ");
        int numberOfYears = s.nextInt();

        System.out.println("Enter Loan amount ");
        double loanAmount = s.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is $"+ (int)monthlyPayment);
        System.out.println("The total payment is $" + (int)totalPayment );
    }



}
