package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ntc
 * @version 1.0
 * @description
 * @since 2022/9/6 14:40
 */
@RestController
public class TestController {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "HELLO WORLD";
    }

}
