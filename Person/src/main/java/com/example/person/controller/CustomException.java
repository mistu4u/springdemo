package com.example.person.controller;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {
  int errCode;
  public CustomException(int code,String errMessage) {
    super(errMessage);
    this.errCode = code;
  }
}
