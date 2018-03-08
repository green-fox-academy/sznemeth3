import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  String first = "godddd";
  String second = "dogdgg";
  Anagram anagram = new Anagram();

  @Test
  public void isAnagram() {
    assertFalse(anagram.isAnagram(first, second));
  }
}