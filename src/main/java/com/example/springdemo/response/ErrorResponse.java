package com.example.springdemo.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ErrorResponse {
  private String currentTime;
  private int id;
  private String message;
}
