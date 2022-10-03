package com.example.networkkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopConfig {

    @Bean
    public NewTopic amigoscodeTopic() {
        return TopicBuilder.name("cleancode").build();
    }
}
