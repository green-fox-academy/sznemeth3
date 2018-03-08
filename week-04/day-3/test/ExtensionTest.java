import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(6, extension.add(3, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(1, extension.add(1, 0));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(6, extension.maxOfThree(5, 4, 6));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(4, extension.maxOfThree(3, 4, 1));
  }

  @Test
  void testMedian_four() {
    assertEquals(3.5, extension.median(Arrays.asList(7,4,3,8)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3.5, extension.median(Arrays.asList(1,2,3,4,9,9)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('e'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}