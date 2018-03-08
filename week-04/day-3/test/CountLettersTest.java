import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
  CountLetters test = new CountLetters();
  String word = "loller";

  @Test
  public void convertToDictionary() {

    assertEquals(test.convertToDictionary(word).get('a'), null);
  }
}