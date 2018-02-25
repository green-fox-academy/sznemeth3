import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the first word");
        String userInput1 = scanner.nextLine();
        char[] charArray1 = userInput1.toCharArray();
        System.out.println("Please provide the second word");
        String userInput2 = scanner.nextLine();
        char[] charArray2 = userInput2.toCharArray();
        if (checkIfAnagram(charArray1, charArray2) == false) {
            System.out.println("Not an Anagram");
        } else {
            System.out.println("Anagram!!!");
        }
    }

    private static boolean checkIfAnagram(char[] userInput1, char[] userInput2) {
        if (userInput1.length != userInput2.length) {
            return false;
        }
        int identicalCounter = 0;
        for (int i = 0; i < userInput1.length; i++) {
            for (int j = 0; j < userInput2.length; j++) {
                if (userInput1[i] == userInput2[j]) {
                    userInput2[j] = 0;
                    identicalCounter++;
                    break;
                }
            }
        }
        if (identicalCounter == (userInput1.length)) {
            return true;
        } else {
            return false;
        }
    }
}

