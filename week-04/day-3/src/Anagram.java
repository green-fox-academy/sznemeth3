import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {
  public boolean isAnagram(String firstWord, String secondWord) {
    List<Character> toSortFirst = new ArrayList<>();
    for (Character c: firstWord.toCharArray()) {
      toSortFirst.add(c);
    }
    List<Character> toSortSecond = new ArrayList<>();
    for (Character c: secondWord.toCharArray()) {
      toSortSecond.add(c);
    }
    Collections.sort(toSortFirst);
    Collections.sort(toSortSecond);
    toSortFirst.toString();
    return  (toSortFirst.toString().equals(toSortSecond.toString()));
  }

  public static void main(String[] args) {
    String first = "god";
    String second = "dog";
    Anagram anagram = new Anagram();
    System.out.println(anagram.isAnagram(first, second));
  }
}
