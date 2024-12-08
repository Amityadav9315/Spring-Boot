package com.amit.program;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("amit")
    public String sayHello(){
        return "Hello";
    }

}
