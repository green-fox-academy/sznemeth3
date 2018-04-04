package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


@Controller
public class BankController {


  @RequestMapping("/show")
  public String show(Model model) {
    BankAccount account = new BankAccount("Simba", 2000.,"lion");
    DecimalFormat format = new DecimalFormat("#.00");
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", format.format(account.getBalance()));
    model.addAttribute("animalType", account.getAnimalType());
    return "show";

  }

  @RequestMapping("/string")
  public String writeString (Model model) {
    String content = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("content", content);

    return "string";
  }

  @RequestMapping("/list")
  public String writeList (Model model) {
    List<BankAccount> accountList = new ArrayList<>();
    accountList.add(new BankAccount("Pumba", 1000., "Pig"));
    accountList.add(new BankAccount("Timon", 9000., "Rat"));
    accountList.add(new BankAccount("Mufasa", 101100., "Lion"));
    accountList.add(new BankAccount("Zordon", 1., "Lion"));
    model.addAttribute("accountList", accountList);

    return "list";
  }

}