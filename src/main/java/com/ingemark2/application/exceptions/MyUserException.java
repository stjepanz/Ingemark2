package com.ingemark2.application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class MyUserException extends RuntimeException {

    public MyUserException(String message) {
        super(message);
    }
}
