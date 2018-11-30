package com.gakki.smile.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/test/hello")
    public Object testhello(){

        return "hello";
    }

}
