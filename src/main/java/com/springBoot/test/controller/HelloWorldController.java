package com.springBoot.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
   @RequestMapping("/hello")
   public String sayHello() {
      return "Hello Spring Boot!!";
   }
}
