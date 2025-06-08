package com.ale.periodic_table.exceptions;

import org.springframework.http.HttpStatus;

public class GroupNotFoundException extends CustomBaseException {
    public GroupNotFoundException() {
        super(HttpStatus.BAD_REQUEST,new SimpleResponse("Group not found"));
    }
}
