import java.util.Scanner;
import java.util.Collections;
public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %   %
        // %   %
        // %   %
        // %   %
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number");
        String a = "*";
        int userInput1 =scanner.nextInt();
        for (int i = 1; i < userInput1 + 1; i++ ) {
            if (i == 1) {
                System.out.println(String.join("", Collections.nCopies( userInput1 - i, " ")) +"*");
            }
            else {
                System.out.println(String.join("", Collections.nCopies( userInput1 - i, " ")) +
                        String.join("", Collections.nCopies(i + (i-1), "*")) +
                        String.join("", Collections.nCopies(userInput1 - i, " ")));
            }

        }

    }
}
