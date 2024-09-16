package com.devteria.identity_service.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
khi co 1 exception xay ra thi class nay se chiu trach nhiem handle
* */
@ControllerAdvice
public class GlobalExceptionHandler {

    // define exception (annotation)

    @ExceptionHandler(value = RuntimeException.class)
    ResponseEntity<String> handlingRuntimeException(RuntimeException exception) {
        return ResponseEntity.badRequest().body(exception.getMessage());
    }

}
