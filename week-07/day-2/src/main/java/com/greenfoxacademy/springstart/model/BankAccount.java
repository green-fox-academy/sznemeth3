package com.greenfoxacademy.springstart.model;

public class BankAccount {
  private String name;
  private Double balance;
  private String animalType;

  public BankAccount(String name, Double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public Double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
    }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}
