package com.xxt.boot.exception;

/**
 * @description: com.xxt.boot.exception
 * @author: haytt.xiang
 * @date: 2020-09-10 11:01
 **/
public class BaseException extends RuntimeException {

    private String code ;

    public BaseException(String message, String code) {
        super(message);
        this.code = code;
    }
}
