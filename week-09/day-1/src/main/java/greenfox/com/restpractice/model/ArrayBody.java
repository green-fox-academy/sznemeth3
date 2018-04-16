package greenfox.com.restpractice.model;

import java.util.ArrayList;

public class ArrayBody {
  private String what;
  private ArrayList<Integer> numbers;

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public ArrayList<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(ArrayList<Integer> numbers) {
    this.numbers = numbers;
  }
}
