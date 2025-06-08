package com.ale.periodic_table.exceptions;

import org.springframework.http.HttpStatus;

public class ElementNotFoundException extends CustomBaseException {

    public ElementNotFoundException() {
        super(HttpStatus.BAD_REQUEST,new SimpleResponse("Element not found"));
    }
}
