package com.example.springdemo1.day1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {
    @RequestMapping("/index")
    public String index(){
        return "Hello World";
    }

}
