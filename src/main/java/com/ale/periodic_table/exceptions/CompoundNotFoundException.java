package com.ale.periodic_table.exceptions;

import org.springframework.http.HttpStatus;

public class CompoundNotFoundException extends CustomBaseException {
    public CompoundNotFoundException() {
        super(HttpStatus.NOT_FOUND,new SimpleResponse("Compound Not Found"));
    }
}
