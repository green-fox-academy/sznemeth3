import java.util.Random;
import java.util.Scanner;
public class GetTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Min number:");
        int userInputMin = scanner.nextInt();
        System.out.println("Max number:");
        int userInputMax = scanner.nextInt();
        System.out.println("Guess a number");
        Random r = new Random();
        int randomNumber = r.ints(1, userInputMin, userInputMax + 1).findFirst().getAsInt();
        int i = 0;
        while ( i < 1 ) {
            int userInputGuess = scanner.nextInt();
            if (userInputGuess == randomNumber) {
                i++;
                System.out.println("Congratulations you guessed the number!!!!");
            }
            else if (userInputGuess < randomNumber){
                System.out.println("Your guess is lower the the number, please guess again");
                i = i;
            }
            else {
                System.out.println("Your guess is higher the the number, please guess again");
                i = i;
            }
        }
    }

}
