package com.greenfoxacademy.mysqldemo.controller;

import com.greenfoxacademy.mysqldemo.model.Todo;
import com.greenfoxacademy.mysqldemo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("todo")
public class TodoController {

  @Autowired
  TodoRepo todoRepo;

  @RequestMapping(value ={"/","/list"})
  public String list(@RequestParam(value = "isActive", required = false)Boolean isActive, Model model) {
    if (isActive == null ) {
      model.addAttribute("todolist", todoRepo.findAll());
    } else {
      model.addAttribute("todolist", todoRepo.findBydone(!isActive));
    }
    return "todolist";
  }

  @RequestMapping(value = "/process")
  public String processForm(@ModelAttribute(value = "title") String title) {
    todoRepo.save(new Todo(title));
    return "redirect:/todo/";
  }

  @RequestMapping(value = "/add_todo")
  public String addTodo() {
    return "add_todo";
  }

  @RequestMapping(value = "/{id}/delete")
  public String deleteTodo(@PathVariable Long id) {
    todoRepo.deleteById(id);
    return "redirect:/todo/";
  }
}
