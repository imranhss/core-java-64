package usecontinue;

public class UseContinue {

    public static void main(String[] args) {

        int targetValue = 50;
        int counter = 1;

        while (counter <= targetValue) {

            if (counter % 3 == 0 && counter % 5 == 0) {
                counter++;
                continue;
            }            
            System.out.println("No is " + counter);
            counter++;

        }

    }

}
