package com.example.projectoop.exception;

public class UserExistException extends Exception{
    public UserExistException(String failure) {
        super(failure);
    }
}
