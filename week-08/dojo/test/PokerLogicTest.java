import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class PokerLogicTest {
  PokerLogic pokerLogic = new PokerLogic();

  @Test
  public void testIfHigherWins() {
    List<String> black = new ArrayList<>(Arrays.asList("2H", "3D", "5S", "9C", "KD"));
    List<String> white = new ArrayList<>(Arrays.asList("2C", "3H", "4S", "8C", "AH"));
    //Arrange
    String expectedResult = "White wins! - (High card: A)";
    //Act
    String result = pokerLogic.getResult(black, white);
    //Assert
    assertEquals(expectedResult, result);
  }

  @Test
  public void testIfBlackHigherWins() {
    List<String> black = new ArrayList<>(Arrays.asList("2H", "3D", "5S", "9C", "KD"));
    List<String> white = new ArrayList<>(Arrays.asList("2C", "3H", "4S", "8C", "KH"));
    //Arrange
    String expectedResult = "Black wins! - (High card: 9)";
    //Act
    String result = pokerLogic.getResult(black, white);
    //Assert
    assertEquals(expectedResult, result);
  }

  @Test
  public void testIfTie() {
    List<String> black = new ArrayList<>(Arrays.asList("6H", "3D", "5S", "9C", "KD"));
    List<String> white = new ArrayList<>(Arrays.asList("5D", "3H", "6C", "9S", "KH"));
    //Arrange
    String expectedResult = "Tie";
    //Act
    String result = pokerLogic.getResult(black, white);
    //Assert
    assertEquals(expectedResult, result);
  }

  @Test
  public void testFlush() {
    List<String> black = new ArrayList<>(Arrays.asList("2H", "4S", "4C", "2D", "4H"));
    List<String> white = new ArrayList<>(Arrays.asList("2S", "8S", "AS", "QS", "3S"));
    //Arrange
    String expectedResult = "White wins! - (Flush: A)";
    //Act
    String result = pokerLogic.getResult(black, white);
    //Assert
    assertEquals(expectedResult, result);
  }

}