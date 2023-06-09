package com.elbertribeiro.controller;

import com.elbertribeiro.dto.CheckoutRequest;
import com.elbertribeiro.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/checkout")
public class CheckoutController {
    private final CheckoutService service;

    public CheckoutController(CheckoutService service) {
        this.service = service;
    }

    @PostMapping
    public String checkPayment(@RequestBody CheckoutRequest checkoutRequest) {
        return service.teste(checkoutRequest);
    }
}
