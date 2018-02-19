public class Factorial {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial
        int inputValue = 5;
        System.out.println(factorio(inputValue));
    }
    public static int factorio (int input) {
        int output = input;
        for (int i = 1; i < input; i++) {
             output *= (input - i);
        }
        return output;
    }
}
