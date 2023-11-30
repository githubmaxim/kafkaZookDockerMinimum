package com.example.consumer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Consumer {

    @KafkaListener(topics="msg", groupId="order-1")
    public void msgListener(String msg){
        System.out.println("Consumer created");
        System.out.println(msg);
        log.info("Прочитано сообщение {}", msg);
    }
}
