package com.example.springbootcli.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/greet")
public class MainController {
    public String greet(){
        return "Hello";
    }
}
