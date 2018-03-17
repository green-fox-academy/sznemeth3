import java.util.Scanner;

public class MultiplicationTable {

    public static void multiply(int userInput) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + userInput + " = " + (userInput * i));
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Please write a number to multiply");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        multiply(userInput);

    }
}
