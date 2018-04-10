package com.greenfoxacademy.mysqldemo.repository;

import com.greenfoxacademy.mysqldemo.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TodoRepo extends CrudRepository<Todo, Long> {

  /*@Query("SELECT t.title FROM Todo t WHERE t.done=false")*/
  public List<Todo> findBydone(Boolean bool);
}
