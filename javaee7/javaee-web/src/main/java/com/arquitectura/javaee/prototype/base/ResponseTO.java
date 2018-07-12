package com.arquitectura.javaee.prototype.base;

import java.sql.Time;
import java.util.Date;

public class ResponseTO<T> {

    private Date time= new Date();
    private String state;
    private String message;
    private T body;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
