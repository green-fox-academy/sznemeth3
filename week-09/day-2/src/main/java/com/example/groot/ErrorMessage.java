package com.example.groot;

public class ErrorMessage implements GrootResponse {
  private String received;
  private String error;

  public ErrorMessage(String received) {
    this.received = received;
    this.error = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
