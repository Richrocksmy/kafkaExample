package com.twentythreesquared.kafkaexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageProducer implements MessageProducer {

  private static final String TOPIC = "MESSAGES";

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  @Override
  public void produce(String message) {
    kafkaTemplate.send(TOPIC, message);
  }
}
