package com.elbertribeiro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/checkout")
public class CheckoutController {
    @GetMapping
    public String hello() {
        return "Hello";
    }
}
