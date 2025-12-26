package com.example.di.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionhandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleInvalidId(IllegalArgumentException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralError(Exception ex){
        return new ResponseEntity<>("An unexpected error occured: " + ex.getMessage(), 
        HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
