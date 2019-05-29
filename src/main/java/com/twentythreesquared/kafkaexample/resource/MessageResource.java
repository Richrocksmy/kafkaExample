package com.twentythreesquared.kafkaexample.resource;

import com.twentythreesquared.kafkaexample.request.CreateMessageRequest;
import com.twentythreesquared.kafkaexample.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/message")
public class MessageResource {

  @Autowired
  private MessageProducer messageProducer;

  @PostMapping
  public void createMessage(@RequestBody CreateMessageRequest message) {
    messageProducer.produce(message.getMessage());
  }
}
