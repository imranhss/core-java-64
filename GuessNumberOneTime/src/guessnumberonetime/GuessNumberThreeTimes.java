package guessnumberonetime;


import java.util.Scanner;

public class GuessNumberThreeTimes {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10); // generates number from 0 to 9

        System.out.println("Guess a number between 0 and 9. You have 3 attempts.");

        int attempts = 0;
        boolean isGuessed = false;

        while (attempts < 3) {
            System.out.print("Enter your guess: ");
            int userInput = s.nextInt();

            if (userInput == randomNumber) {
                System.out.println("You Win!");
                isGuessed = true;
                break;
            } else if (userInput < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            attempts++;
        }

        if (!isGuessed) {
            System.out.println("Better Luck Next Time! The correct number was: " + randomNumber);
        }

        s.close();
    }

}
