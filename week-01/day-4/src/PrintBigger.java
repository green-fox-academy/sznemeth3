import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that asks for two numbers and prints the bigger one
        System.out.println("Please provide TWO integer numbers");
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        if (userInput1 > userInput2) {
            System.out.println(userInput1);
        }
        else if (userInput1 < userInput2) {
            System.out.println(userInput2);
        }
        else {
            System.out.println("The numbers are even");
        }

    }
}
