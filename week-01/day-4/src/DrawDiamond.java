import java.util.Collections;
import java.util.Scanner;


public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number");
        String a = "*";
        int userInput1 =scanner.nextInt();
        if ( userInput1%2 == 0) {
            System.out.println("Amount of lines should be odd number");
        }
        else {
            for (int i = 1; i < userInput1 + 1; i++ ) {
                // Top of the diamond
                if (i == 1) {
                    System.out.println(String.join("", Collections.nCopies( (userInput1 + 1)/2 - 1, " ")) + a);
                }
                //Above the middle of the diamond but not the top
                else if (i != 1 && i != userInput1 && i < ((userInput1+1) /2)) {

                    System.out.println(String.join("", Collections.nCopies( (userInput1 + 1)/2 - i, " ")) +
                            String.join("", Collections.nCopies(i + (i-1), a)));
                }
                //Half of the diamond
                else if (i == ((userInput1 + 1)/ 2)) {
                    System.out.println(String.join("", Collections.nCopies( userInput1, a)));
                }
                // Below the middle of the diamond
                else if (i > ((userInput1 +1) /2) && i != userInput1) {
                    System.out.println(String.join("", Collections.nCopies( i -((userInput1 +1)/2), " ")) +
                            String.join("", Collections.nCopies((userInput1 - i) + 1 + ((userInput1 - i +1)-1), a)));

                }
                //bottom of the diamond
                else {
                    System.out.println(String.join("", Collections.nCopies( (userInput1 + 1)/2 - 1, " ")) +
                            a);
                }
            }
        }
    }
}
