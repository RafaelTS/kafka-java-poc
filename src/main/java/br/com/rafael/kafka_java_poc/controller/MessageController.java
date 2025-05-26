package br.com.rafael.kafka_java_poc.controller;

import br.com.rafael.kafka_java_poc.producer.KafkaProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final KafkaProducerService kafkaProducerService;

    public MessageController(KafkaProducerService kafkaProducerService){
        this.kafkaProducerService = kafkaProducerService;
    }

    private static final Logger log = LoggerFactory.getLogger(MessageController.class);

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestParam String message) {
        // Aqui vai o log!
        log.info("Mensagem recebida no controller: {}", message);
        return ResponseEntity.ok("Mensagem enviada: " + message);
    }
}
