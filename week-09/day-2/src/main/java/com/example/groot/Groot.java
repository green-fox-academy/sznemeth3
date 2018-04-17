package com.example.groot;

public class Groot implements GrootResponse{
  private String received;
  private String transleted;

  public Groot(String received) {
    this.received = received;
    this.transleted = "I am Groot!";
  }

  public Groot() {
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTransleted() {
    return transleted;
  }

  public void setTransleted(String transleted) {
    this.transleted = transleted;
  }
}
