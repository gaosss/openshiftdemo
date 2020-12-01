package com.example.openshiftdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String getStr (){
        return "this is a shift demo";
    }
}
