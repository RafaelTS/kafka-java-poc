package br.com.rafael.kafka_java_poc.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "poc-topic", groupId = "kafka-poc-group")
    public void listen(String message) {
        System.out.println("Mensagem recebida no Kafka: " + message);
        logger.info("Received message: {}", message); // Isso será capturado pelos logs do container
    }
}
