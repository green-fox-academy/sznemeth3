package com.greenfoxacademy.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GreenColor implements MyColor{

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("It is green in color...");
  }
}
