import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        if (checkNums(list) ==true) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }


        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"

    }

    private static boolean checkNums(ArrayList<Integer> inputArray) {
        ArrayList<Integer> checkList = new ArrayList<>(Arrays.asList(4 ,8 ,12 ,16));
        int identicalCounter = 0;
        for (int element:checkList) {
            if (inputArray.contains(element) == true) {
                identicalCounter++;
            }
        }
        if (identicalCounter==checkList.size()) {
            return true;
        }
        else {
            return false;
        }
    }
}
