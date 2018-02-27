import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once
    //  Example
    System.out.println(Arrays.toString(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34})));
    int[] printList = unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34});
    for (int i = 0; i < printList.length; i++) {
      System.out.print(printList[i] + " ");
    }
    //  should print: `[1, 11, 34, 52, 61]`
  }

  public static int[] unique(int inputList[]) {
    int[] templist = new int[inputList.length];
    for (int j = 0; j < inputList.length; j++) {
      int duplicateCounter = 0;
      for (int i = 0; i < templist.length; i++) {
        if (templist[i] == inputList[j]) {
          duplicateCounter++;
        }
      }
      if (duplicateCounter == 0) {
        templist[j] = inputList[j];
      }
    }
    int zeroCounter = 0;
    for (int i = 0; i < templist.length; i++) {
      if (templist[i] == 0) {
        zeroCounter++;
      }
    }
    int nextIndex = 0;
    int[] uniqueList = new int[templist.length - zeroCounter];
    for (int i = 0; i < templist.length; i++) {
      if (templist[i] != 0) {
        uniqueList[nextIndex] = templist[i];
        ++nextIndex;
      }
    }
    return uniqueList;
  }
}
