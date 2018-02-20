public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }
    public static int[] unique(int inputList[]) {
        int sortedList[] = new  int[inputList.length];
        for (int i = 0; i <inputList.length; i++) {
            for (int j = i; j < inputList.length; j++) {
                if (inputList[i] > inputList[j]) {
                    sortedList[i]=inputList[j];
                    inputList[j]=inputList[i];
                    inputList[i]=sortedList[i];
                }
                else {
                    sortedList[i] =inputList[i];
                }
            }
        }
        int uniqueCounter = 1;
        for (int k = 0; k < sortedList.length; k++) {
            if (sortedList[k] != sortedList[k + 1]) {
                uniqueCounter++;
            }
        }
        int uniqueList[] = new int[uniqueCounter];
        uniqueList[0]=sortedList[0];
        for (int i = 1; i < sortedList.length; i++) {
                if (sortedList[i]!=sortedList[i-1]) {
                    uniqueList[i] = sortedList[i];
                }
        }
        return uniqueList;
    }
}
