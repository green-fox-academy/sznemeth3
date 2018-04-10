package com.greenfoxacademy.mysqldemo;

import com.greenfoxacademy.mysqldemo.model.Todo;
import com.greenfoxacademy.mysqldemo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlDemoApplication implements CommandLineRunner {
  @Autowired
  TodoRepo todoRepo;

  public static void main(String[] args) {
    SpringApplication.run(MysqlDemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepo.save(new Todo("Bolt"));
    todoRepo.save(new Todo("Futas",true,false));
    todoRepo.save(new Todo("Eves",true,true));
    todoRepo.save(new Todo("Tanulas"));
  }
}
