import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quote(list));
        // Expected output: "What I cannot create I do not understand."

    }

    private static String quote(ArrayList<String> inputList) {
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(inputList);
        inputList.set(list.indexOf("do"),list.get(list.indexOf("cannot")));
        inputList.set(list.indexOf("cannot"),list.get(list.indexOf("do")));
        //what i cannot create i do not understand
        return inputList.toString();
    }
}