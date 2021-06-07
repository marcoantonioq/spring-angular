package com.marcoaq7.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

  @GetMapping
  public String index() {
    return "Olá mundo!";
  }

}
