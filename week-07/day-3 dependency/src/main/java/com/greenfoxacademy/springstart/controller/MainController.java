package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  UtilityService utilityService;

    @GetMapping("/")
    public String showIndexPage(Model model) {

      return "useful";
    }

  @GetMapping("/useful/colored")
  public String colorPage(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String emailCheck(Model model, @RequestParam("email") String email) {
    model.addAttribute("email", utilityService.validateEmail(email));
    return "email";
  }

}
