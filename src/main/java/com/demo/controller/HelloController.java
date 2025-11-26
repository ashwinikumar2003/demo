package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/")
public class HelloController {
    
    @GetMapping("")
    public String getMethodName() {
        return new String("Hello World, this is my first Jenkin job!!!");
    }
    
}
