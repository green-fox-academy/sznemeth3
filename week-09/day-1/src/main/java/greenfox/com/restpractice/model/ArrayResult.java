package greenfox.com.restpractice.model;

import java.util.ArrayList;

public class ArrayResult {
  private ArrayList<Integer> result;

  public ArrayList<Integer> getResult() {
    return result;
  }

  public void setResult(ArrayList<Integer> result) {
    this.result = result;
  }

  public ArrayResult(ArrayList<Integer> result) {
    this.result = result;
  }
}
