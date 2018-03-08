import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  Fibonacci fibonacci = new Fibonacci();
  Integer input1 = 8;
  Integer input2 = 0;

  @Test
  public void fibo1() {
    assertEquals(fibonacci.fibo(input1),21);
  }
  @Test
  public void fibo2() {
    assertEquals(fibonacci.fibo(input2),0);
  }
}