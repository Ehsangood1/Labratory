package com.example.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, dear friend!";
    }
    @GetMapping("/GoodBye")
    public String sayGoodbye() {
        return "where you are going to go tonight?";
    }

}
