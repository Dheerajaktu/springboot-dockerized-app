package com.dev.application.dockerizedApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 
@RequestMapping("/v1/docker")
public class HelloController {

    @GetMapping("/test")
    public String getMethodName() {
        return "Application is Running...!!";
    }

}
