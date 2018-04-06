package com.greenfoxacademy.springstart.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceMethod {
  public List<BankAccount> fillList(List<BankAccount> accountList) {
    accountList = new ArrayList<>();
    accountList.add(new BankAccount("Pumba", 1000., "Pig"));
    accountList.add(new BankAccount("Timon", 9000., "Rat"));
    accountList.add(new BankAccount("Mufasa", 101100., "Lion"));
    accountList.add(new BankAccount("Zordon", 1., "Lion"));
    return accountList;
  }
}
