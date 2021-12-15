package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartApi {

    @GetMapping("/")
    public String hello(){
        return "Start API";
    }
    
}
