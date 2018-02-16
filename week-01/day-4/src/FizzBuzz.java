
public class FizzBuzz {
    public static void main(String[] args) {

        for (int a = 1; a < 101; a ++) {
            if (a%3 != 0 && a%5 !=0) {
                System.out.println(a);
            }
            else if (a%3 == 0 && a%5 !=0) {
                System.out.println("Fizz");
            }
            else if (a%3 != 0 && a%5 ==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println("FizzBuzz");
            }
        }


        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.
    }

}
