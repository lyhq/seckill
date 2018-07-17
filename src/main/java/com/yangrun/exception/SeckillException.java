package com.yangrun.exception;

/**
 * Created by yangrun on 21:36 2017/11/29
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
