package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("todo")
public class TodoController {

  @Autowired
  TodoRepo todoRepo;

  @RequestMapping(value ={"/","/list"})
  public String list(Model model) {
    model.addAttribute("todolist", todoRepo.findAll());
    return "todolist";
  }
}
