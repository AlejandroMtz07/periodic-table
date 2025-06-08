package com.ale.periodic_table.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomBaseException.class)
    public ResponseEntity<SimpleResponse> handleCustomBaseException(CustomBaseException e) {
        return ResponseEntity.status(e.getStatus()).body(e.getSimpleResponse());
    }

}
