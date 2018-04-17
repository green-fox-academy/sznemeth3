package com.example.groot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping(value = "/groot")
  public ResponseEntity<GrootResponse> translater(@RequestParam(value = "message", required = false) String somemessage){
    if (somemessage == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("I am Groot!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Groot(somemessage));
    }
  }
}
