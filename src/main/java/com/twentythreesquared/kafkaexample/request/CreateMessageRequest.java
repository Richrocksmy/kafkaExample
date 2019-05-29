package com.twentythreesquared.kafkaexample.request;

import lombok.Data;

import java.util.UUID;

@Data
public class CreateMessageRequest {

  private final UUID id;
  
  private final String message;
}
