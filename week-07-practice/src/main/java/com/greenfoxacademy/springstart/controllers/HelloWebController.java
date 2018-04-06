package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong id = new AtomicLong(1);

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};


  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name) {
    Random randomNumber = new Random();
    model.addAttribute("hello", hellos);
    model.addAttribute("fontSize", randomNumber.nextInt(15)+1);
    model.addAttribute("r", randomNumber.nextInt(255));
    model.addAttribute("g", randomNumber.nextInt(255));
    model.addAttribute("b", randomNumber.nextInt(255));
    model.addAttribute("name", name);
    model.addAttribute("id", id.getAndIncrement());
    return "greeting";
  }
}
