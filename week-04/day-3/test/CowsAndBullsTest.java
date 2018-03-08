import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class CowsAndBullsTest {
  CowsAndBulls cab = new CowsAndBulls();
  Scanner scanner = new Scanner(System.in);
  @Test
  public void checkIfRandomNumberLengthIs4() {
    assertEquals(cab.getRandomNumber().length(), 4);
  }
  @Test
  public void checkIfBaseStateIsPlaying() {
    assertEquals(cab.getState(), "playing");
  }



}