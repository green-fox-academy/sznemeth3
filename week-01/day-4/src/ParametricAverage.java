import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of numbers");
        int userInputAmount = scanner.nextInt();
        int i = 0;
        List<Integer> myList = new ArrayList<Integer>();
        while (i < userInputAmount) {
            System.out.println("Put a number");
            int userInputAmount1 = scanner.nextInt();
            //int userInputAmount<i> = scanner.nextInt();

            myList.add(userInputAmount1);
            i++;
        }
        double sum = 0;
        int j;
        for(j = 0; j < myList.size(); j++) {
            sum += myList.get(j);

        }
        System.out.println(sum);
        System.out.println(sum / userInputAmount);

    }


}
