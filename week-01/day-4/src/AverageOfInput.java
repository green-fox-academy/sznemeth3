import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 5 integer numbers");
        int userInput1 =scanner.nextInt();
        int userInput2 =scanner.nextInt();
        int userInput3 =scanner.nextInt();
        int userInput4 =scanner.nextInt();
        int userInput5 =scanner.nextInt();
        int a = (userInput1 + userInput2 + userInput3 + userInput4 + userInput5);
        double b = (double)a/5;
        System.out.println("Sum: " + a + " Average: " + b);
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
    }
}
