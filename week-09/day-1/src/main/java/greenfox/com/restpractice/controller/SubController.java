package greenfox.com.restpractice.controller;

import greenfox.com.restpractice.model.*;
import greenfox.com.restpractice.service.ArrayService;
import greenfox.com.restpractice.service.ArrayServiceImpl;
import greenfox.com.restpractice.service.DoUntilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class SubController {


  private DoUntilServiceImpl doUntilServiceImpl;

  @Autowired
  public void DoUntilService(){
    this.doUntilServiceImpl = new DoUntilServiceImpl();
  }

  @RequestMapping(value = "/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Long input) {
    if (input == null) {
      return new ErrorMsg("Please provide an input!");
    }
    return new Input(input);
  }

  @RequestMapping(value = "/greeter")
  public Object greeting(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if ( name != null && title != null) {
      return new Name(name, title);
    } else if ( name != null && title == null) {
      return new ErrorMsg("Please provide a title!");
    } else {
      return new ErrorMsg("Please provide a name!");
    }
  }

  @RequestMapping(value = "/appenda/{appendable}")
  public Object appendA( @PathVariable String appendable ) {
    return new Append(appendable);
  }

  @PostMapping(value = "/dountil/{what}")
  public Object doUntil(@PathVariable(name = "what", required = false) String what, @RequestBody Until until) {
    if (what != null && until != null) {
      if (what.equals("sum")) {
        return doUntilServiceImpl.sum(until.getUntil());
      } else if (what.equals("factor")) {
        return doUntilServiceImpl.factor(until.getUntil());
      }
    }
    return new ErrorMsg("Please provide a number!");
  }
}
