import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in a number that will be converted to kilometers");
        int userInput1 =scanner.nextInt();
        double convertValue = 0.621371192;
        System.out.println("This equals " + userInput1 * convertValue + " miles");
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

    }
}


