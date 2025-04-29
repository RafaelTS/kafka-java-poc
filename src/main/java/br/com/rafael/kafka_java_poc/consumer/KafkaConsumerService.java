package br.com.rafael.kafka_java_poc.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "poc-topic", groupId = "kafka-poc-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
        // Aqui você poderia também logar para o Splunk
    }
}
