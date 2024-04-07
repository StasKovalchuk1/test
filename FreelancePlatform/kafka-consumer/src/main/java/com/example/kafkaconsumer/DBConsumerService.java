package com.example.kafkaconsumer;


import com.example.kafkaconsumer.entity.TestEntityData;
import com.example.kafkaconsumer.repository.TestDataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DBConsumerService {


    private final TestDataRepository repo;


    @Autowired
    public DBConsumerService(TestDataRepository repo) {
        this.repo = repo;
    }

    @KafkaListener(
            topics="test_topic",
            groupId = "myGroup")
    public void consume(String eventMessage){
        log.info(String.format("Event message received -> %s", eventMessage));

        TestEntityData testData = new TestEntityData();
        testData.setEventData(eventMessage);

        repo.save(testData);
    }
}
