import java.util.Scanner;
import java.util.Collections;

public class DrawTriange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number");
        String a = "*";
        int userInput1 =scanner.nextInt();
        for (int i = 1; i < userInput1 + 1; i++ ) {
            System.out.println(String.join("", Collections.nCopies(i, "*")));
        }
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
    }
}
