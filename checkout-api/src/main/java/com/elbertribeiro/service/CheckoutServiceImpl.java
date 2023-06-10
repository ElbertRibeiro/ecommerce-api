package com.elbertribeiro.service;

import com.elbertribeiro.dto.CheckoutRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public CheckoutServiceImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public String teste(CheckoutRequest checkoutRequest) {
        this.enviaEvento(checkoutRequest);
        return "Evento criado";
    }

    private void enviaEvento(Object o){
        kafkaTemplate.send("meu-topico", o.toString());
    }
}
