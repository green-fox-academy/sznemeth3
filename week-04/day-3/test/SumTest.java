import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  Sum summa = new Sum();
  Integer test = 0;


  @Test
  public void sum1() {
    List<Integer> testList = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      testList.add(i);
    }
    assertEquals(test, summa.sum(testList));

  }

  @Test
  public void sum2() {
    List<Integer> testList = new ArrayList<>();


    assertEquals(test, summa.sum(testList));

  }

  @Test
  public void sum3() {
    List<Integer> testList = new ArrayList<>();

    testList.add(test);

    assertEquals(test, summa.sum(testList));

  }

  @Test (expected = NullPointerException.class)
  public void sum4() {
    List<Integer> testList = new ArrayList<>();

    testList.add(null);

    assertEquals(test, summa.sum(testList));

  }
}