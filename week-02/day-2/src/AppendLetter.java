import java.util.*;
public class AppendLetter {
        public static void main(String... args){
            List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
            // Create a method called "appendA()" that adds "a" to every string in the "far" list.
            // The parameter should be a list.

            System.out.println(appendA(far));
        }
        public static List<String> appendA(List<String> inputList ) {
            for (String item : inputList) {
                inputList.set(inputList.indexOf(item),item + "a");
            }
                return inputList;
        }
}
