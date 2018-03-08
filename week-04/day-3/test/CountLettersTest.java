import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
  CountLetters test = new CountLetters();
  String word = "loller";

  @Test
  public void testWithNotExistingLetter() {

    assertEquals(test.convertToDictionary(word).get('a'), null);
  }

  @Test
  public void testWithExistingLetter() {

    assertEquals(test.convertToDictionary(word).get('l'), 3);
  }
}