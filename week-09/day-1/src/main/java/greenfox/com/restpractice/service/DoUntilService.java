package greenfox.com.restpractice.service;

import greenfox.com.restpractice.model.Result;

public interface DoUntilService {
  public Result sum(Integer until);
  public Result factor(Integer until);
}
