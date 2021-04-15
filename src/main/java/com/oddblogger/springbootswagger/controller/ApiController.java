package com.oddblogger.springbootswagger.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ApiController {

  @GetMapping
  public ResponseEntity<Object> getData() {
    return ResponseEntity.ok(
        new HashMap<>(Map.of(
            "key1", "value1"
        ))
    );
  }

}
