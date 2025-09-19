package com.example.aws_spring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AppController {
    
    @GetMapping("/hello")
    public String gello() {
        return "Hello AWS!!";
    }
    
}
