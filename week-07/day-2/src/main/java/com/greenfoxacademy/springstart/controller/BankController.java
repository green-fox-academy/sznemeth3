package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.model.BankAccount;
import com.greenfoxacademy.springstart.model.ServiceMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


@Controller
public class BankController {
  private static List<BankAccount> accountList;

  @Autowired
  ServiceMethod serviceMethod;

  @RequestMapping("/fill")
  public String show(Model model) {
    accountList = serviceMethod.fillList(accountList);
    return "redirect:/list";
  }

  @RequestMapping("/string")
  public String writeString(Model model) {
    String content = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("content", content);

    return "string";
  }

  @RequestMapping("/add")
  public String addAccount(Model model) {
    String content = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("content", content);

    return "string";
  }

  @RequestMapping(value = "/list")
  public String writeList(Model model) {
    model.addAttribute("accountList", accountList);
    return "list";
  }

  @RequestMapping(value = "/process")
  public String processForm(@ModelAttribute(value = "BankAccount") BankAccount bankAccount, Model model) {
    accountList.add(bankAccount);
    model.addAttribute("accountList", accountList);
    return "redirect:/list";
  }

  @RequestMapping(value = "/add_account", method = RequestMethod.GET)
  public String addAccount(@ModelAttribute(value = "BankAccount") BankAccount bankAccount, Model model) {
    return "add_account";
  }

}