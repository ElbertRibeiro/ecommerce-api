package com.elbertribeiro.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private static final Logger logger = LoggerFactory.getLogger(PaymentService.class);
    @KafkaListener(topics = "meu-topico", groupId = "group_id")
    public void consume(ConsumerRecord<String, String> payload) {
        logger.info("Tópico: {}", "meu-topico");
        logger.info("key: {}", payload.key());
        logger.info("Headers: {}", payload.headers());
        logger.info("Partion: {}", payload.partition());
        logger.info("Order: {}", payload.value());
    }
}
