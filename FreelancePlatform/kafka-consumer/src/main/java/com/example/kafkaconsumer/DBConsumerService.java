package com.example.kafkaconsumer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DBConsumerService {


    @KafkaListener(
            topics="test_topic",
            groupId = "myGroup")
    public void consume(String eventMessage){
        log.info(String.format("Event message received -> %s", eventMessage));

    }
}
