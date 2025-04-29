package br.com.rafael.kafka_java_poc.producer;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, String> KafkaTemplate){
        this.kafkaTemplate = KafkaTemplate;
    }

    public void sendMessage(String topic, String message){
        kafkaTemplate.send(topic, message);
    }
}
