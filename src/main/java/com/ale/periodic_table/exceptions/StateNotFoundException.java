package com.ale.periodic_table.exceptions;

import org.springframework.http.HttpStatus;

public class StateNotFoundException extends CustomBaseException {
    public StateNotFoundException() {
        super(HttpStatus.NOT_FOUND, new SimpleResponse("Compounds or state not found"));
    }
}
