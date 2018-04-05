package com.greenfoxacademy.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepenApplication implements CommandLineRunner {


  public static void main(String[] args) {
    SpringApplication.run(DepenApplication.class, args);
  }

  @Autowired
  Printer printer;

  @Autowired
  MyColor myColor;

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    myColor.printColor();

  }
}
