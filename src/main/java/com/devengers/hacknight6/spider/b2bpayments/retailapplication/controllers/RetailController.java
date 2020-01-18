package com.devengers.hacknight6.spider.b2bpayments.retailapplication.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetailController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
