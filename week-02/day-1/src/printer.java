public class Printer {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `printer`
        //   which prints the input String parameters
        // - It can have any number of parameters

        // Examples
        // printer("first")
        // printer("first", "second")
        // printer("first", "second", "third", "fourh")
        // ...
        String inputPrinter1 = "first";
        String inputPrinter2 = "second";
        String inputPrinter3 = "third";
        printer(inputPrinter1, inputPrinter2, inputPrinter3, "fifth");

    }
    public static void printer(String... args) {
        for (String arg : args) {
            System.out.print(arg + " ");
        }



    }
}
