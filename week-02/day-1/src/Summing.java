public class Summing {
    public static void main (String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.
        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer
        int inputNumber = 10;
        System.out.println(sum(inputNumber));

    }
    public static int sum(int a) {
        int valueOfNumbers = 0;
        for (int i = 0; i < a; i++) {
            valueOfNumbers += i;
        }
        
        return valueOfNumbers;
    }
}
