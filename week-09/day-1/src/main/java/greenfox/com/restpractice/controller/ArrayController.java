package greenfox.com.restpractice.controller;

import greenfox.com.restpractice.model.ArrayBody;
import greenfox.com.restpractice.model.ErrorMsg;
import greenfox.com.restpractice.service.ArrayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {
  private  ArrayServiceImpl arrayServiceImpl;
  @Autowired
  public void ArrayService(){
    this.arrayServiceImpl = new ArrayServiceImpl();
  }
  @PostMapping(value = "/arrays")
  public Object doUntil(@RequestBody ArrayBody arrayBody) {
    if (arrayBody.getWhat().equals("sum")) {
      return arrayServiceImpl.sum(arrayBody.getNumbers());
    }
    if (arrayBody.getWhat().equals("multiply")) {
      return arrayServiceImpl.fact(arrayBody.getNumbers());
    }
    if (arrayBody.getWhat().equals("double")) {
      return arrayServiceImpl.doubler(arrayBody.getNumbers());
    }
    return new ErrorMsg("Please provide what to do with the numbers!");
  }
}
