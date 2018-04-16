package greenfox.com.restpractice.service;

import greenfox.com.restpractice.model.Result;
import org.springframework.stereotype.Service;

@Service
public class DoUntilServiceImpl implements DoUntilService{
  @Override
  public Result sum(Integer until) {
   Integer endResult = 1;
      for (int i = 2; i < until +1; i++) {
        endResult += i;
      }
      return new Result(endResult);
  }

  @Override
  public Result factor(Integer until) {
    Integer endResult = 1;
    for (int i = 2; i < until +1; i++) {
      endResult *= i;
    }
    return new Result(endResult);
  }
}
