package com.elbertribeiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class CheckoutApi {
    public static void main(String[] args) {
        SpringApplication.run(CheckoutApi.class, args);
    }
}