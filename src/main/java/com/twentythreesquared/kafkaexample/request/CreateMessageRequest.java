package com.twentythreesquared.kafkaexample.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMessageRequest {

  private UUID id;
  
  private String message;
}
