package com.jeremy.qaas.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
    @GetMapping("/hello")
    public String helloWorld(){
        return "hello World";
    }
}
