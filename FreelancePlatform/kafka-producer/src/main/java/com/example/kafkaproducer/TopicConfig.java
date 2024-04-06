package com.example.kafkaproducer;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {


    public NewTopic topic(){
        return TopicBuilder.name("test_topic")
                .build();
    }
}
