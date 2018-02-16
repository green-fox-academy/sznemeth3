import java.util.Collections;
import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number");
        String a = "%";
        int userInput1 =scanner.nextInt();
        for (int i = 1; i < userInput1 + 1; i++ ) {
            if (i == 1) {
                System.out.println(String.join("", Collections.nCopies( userInput1, a)));
            }
            else if (i != userInput1) {
                System.out.println( "%" +
                        String.join("", Collections.nCopies( i - 2, " ")) + a +
                        String.join("", Collections.nCopies(userInput1 -3 -(i - 2), " ")) +
                        a);
            }
            else {
                System.out.println(String.join("", Collections.nCopies( userInput1, a)));
            }
        }

    }
}
