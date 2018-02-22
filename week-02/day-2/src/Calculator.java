import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        System.out.println("Please type in the expression:");
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();
        List<String> myList = new ArrayList<String>(Arrays.asList(userInput1.split(" ")));
        System.out.println(myList);
        System.out.println(calculus(myList));

    }

    private static int calculus(List<String> myList) {
        int output = 0;
        System.out.println(myList.get(0));
        if (myList.get(0).equals("+")) {
            output = Integer.parseInt(myList.get(1)) + Integer.parseInt(myList.get(2));
            return output;
        }
        return output;
    }
}