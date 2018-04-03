package com.greenfoxacademy.springstart.controllers;

public class Greating {
  private Long Id;
  private String Content;

  public long getId() {
    return Id;
  }

  public String getContent() {
    return Content;
  }

  public Greating(long id, String content) {
    Id = id;
    Content = content;
  }
}
