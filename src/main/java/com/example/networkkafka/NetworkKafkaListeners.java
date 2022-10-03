package com.example.networkkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NetworkKafkaListeners {

    @KafkaListener(
            topics = "cleancode",
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received : "+data+"/");
    }
}
