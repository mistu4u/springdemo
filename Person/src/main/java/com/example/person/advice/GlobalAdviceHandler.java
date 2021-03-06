package com.example.person.advice;

import com.example.person.controller.CustomException;
import com.example.person.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalAdviceHandler {
  @ExceptionHandler(CustomException.class)
  public ResponseEntity<ErrorResponse> handleExceptions(CustomException customException) {
    return new ResponseEntity<>(ErrorResponse.builder().id(customException.getErrCode())
            .currentTime(LocalDateTime.now().toString())
            .message(customException.getMessage()).build(), HttpStatus.BAD_REQUEST);
  }
}
