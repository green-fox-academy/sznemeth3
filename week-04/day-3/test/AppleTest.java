import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
  String message = "Hello World";
  Apple apple = new Apple();

  @Test
  public void getApple() {
    assertNotEquals(message, apple.getApple());
  }
}