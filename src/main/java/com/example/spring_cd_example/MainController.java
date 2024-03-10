package com.example.spring_cd_example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1")
public class MainController {

  @GetMapping
  public ResponseEntity<?> getMethodName() {
    HashMap<String, String> map = new HashMap<>();
    map.put("name", "harshit pachori");
    map.put("age", "22");
    map.put("address", "Aligarh , UP");
    map.put("mobile", "1234567890");
    return new ResponseEntity<>(map, HttpStatus.OK);
  }

}
