package com.example.capston3.controller;

import com.example.capston3.Capston3Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloController {
    public static void main(String[] args) {
        SpringApplication.run(Capston3Application.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}
