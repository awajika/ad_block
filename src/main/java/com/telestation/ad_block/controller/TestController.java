package com.telestation.ad_block.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  @GetMapping("/demo")
  public String demo() {
    return "Hello CI/CD demo!!!!";
  }
}
