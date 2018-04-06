package com.greenfoxacademy.tamagochi.controller;

import com.greenfoxacademy.tamagochi.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping("/")
  public String showBase(@RequestParam (value = "name", required = false) String name, Model model) {
    fox.setName(name);
    if (name == null) {
      model.addAttribute("name", "Mr.Fox");
    } else {
      model.addAttribute("name", fox);
    }
    return "index";
  }

  @RequestMapping(value = "login", method = RequestMethod.GET)
  public String login() {
    return "login";
  }

  @RequestMapping(value = "login", method = RequestMethod.POST)
  public String loginRedirect(@RequestParam (value = "name", required = false) String name) {
    if (name.isEmpty()) {
      return "redirect:/";
    } else {
        return "redirect:/?name=" + name;
    }
  }
}
