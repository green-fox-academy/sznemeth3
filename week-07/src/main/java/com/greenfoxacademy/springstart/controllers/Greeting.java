package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private Long Id;
  private String Content;

  public Long getId() {
    return Id;
  }

  public String getContent() {
    return Content;
  }

  public Greeting(Long id, String content) {
    Id = id;
    Content = content;
  }
}
