import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  String first = "g  od";
  String second = "dog  ";
  Anagram anagram = new Anagram();

  @Test
  public void isAnagram() {
    assertTrue(anagram.isAnagram(first, second));
  }
}