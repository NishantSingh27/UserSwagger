package com.rest.userswag.exception;

//UserNotFoundException.java (Custom Exception)
public class UserNotFoundException extends RuntimeException {
 public UserNotFoundException(String message) {
     super(message);
 }
}

