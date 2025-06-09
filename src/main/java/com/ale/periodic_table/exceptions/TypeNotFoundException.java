package com.ale.periodic_table.exceptions;

import org.springframework.http.HttpStatus;

public class TypeNotFoundException extends CustomBaseException {
    public TypeNotFoundException() {
        super(HttpStatus.NOT_FOUND,new SimpleResponse("Type Not Found"));

    }
}
