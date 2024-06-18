package com.consistency.exceptions;

/**
 * 异常类
 *
 * @author xiayang
 **/
public class ConsistencyException extends RuntimeException {

    public ConsistencyException() {
    }

    public ConsistencyException(Exception e) {
        super(e);
    }

    public ConsistencyException(String message) {
        super(message);
    }


}
