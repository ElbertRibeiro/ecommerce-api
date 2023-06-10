package com.elbertribeiro.controller;

import com.elbertribeiro.checkout.CheckoutRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/checkout")
public class CheckoutController {
    @PostMapping
    public String checkPayment(@RequestBody CheckoutRequest checkoutRequest) {
        return checkoutRequest.getFirstName();
    }
}
