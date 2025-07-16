package com.example.demo.myfirstapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //Marks this class as a REST controller

public class HelloWorldController {

    @Value("${app.greeting.message}")
    private String customGreeting;
    
    @GetMapping("/hello") //Maps HTTP GET requests to /hello
    public String sayHello() {
        return customGreeting; //Returns a simple greeting
}
}