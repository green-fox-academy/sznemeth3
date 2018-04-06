package com.greenfoxacademy.tamagochi.models;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Fox {
  private String name;
  private List<Trick> listOfTricks;
  private String food;
  private String drink;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Fox() {
  }
}
