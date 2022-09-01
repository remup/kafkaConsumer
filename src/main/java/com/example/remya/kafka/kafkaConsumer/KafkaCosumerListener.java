package com.example.remya.kafka.kafkaConsumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaCosumerListener {

	@KafkaListener(topics = "TestTopic", groupId = "group_string",
            containerFactory = "kafkaListenerContainerFactory")
	
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "NewTopic", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
    
    

}
