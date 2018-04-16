package greenfox.com.restpractice.service;

import greenfox.com.restpractice.model.ArrayResult;
import greenfox.com.restpractice.model.Result;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ArrayServiceImpl implements ArrayService {
  public ArrayServiceImpl() {
  }

  @Override
  public Result sum(ArrayList<Integer> numbers) {
    int result = 0;

    for (Integer number: numbers) {
      result += number;
    }
    return new Result(result);
  }

  @Override
  public Result fact(ArrayList<Integer> numbers) {
    int result = 1;

    for (Integer number: numbers) {
      result *= number;
    }
    return new Result(result);
  }

  @Override
  public ArrayResult doubler(ArrayList<Integer> numbers) {
    ArrayList<Integer> result = new ArrayList<>();
    for (Integer number: numbers) {
      result.add(number * 2);
    }
    return new ArrayResult(result);
  }
}
