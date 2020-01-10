package com.jihene.parc.model;

import java.util.Date;

public class Response {

    // Generate Getters and Setters...
    private Object data;
    private Date date;

    public Response(Object data, Date date) {
        super();
        this.data = data;
        this.date = date;
    }
}