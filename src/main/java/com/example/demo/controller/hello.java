package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class hello {
    @GetMapping("/")
    public String hello(){
        return "A demo of Jenkins pipeline!!";
    }
}
