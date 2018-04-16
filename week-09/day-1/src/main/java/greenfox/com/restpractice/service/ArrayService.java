package greenfox.com.restpractice.service;

import greenfox.com.restpractice.model.ArrayResult;
import greenfox.com.restpractice.model.Result;

import java.util.ArrayList;

public interface ArrayService {
  public Result sum(ArrayList<Integer> numbers);
  public Result fact(ArrayList<Integer> numbers);
  public ArrayResult doubler(ArrayList<Integer> numbers);
}
