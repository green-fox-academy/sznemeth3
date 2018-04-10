package com.greenfoxacademy.todo.repository;

import com.greenfoxacademy.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long> {
}
