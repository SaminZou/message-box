package com.samin.mbox.common.exception;

import lombok.Getter;

@Getter
public class BusiException extends RuntimeException {

    private final int code;

    public BusiException(int code) {
        this.code = code;
    }

    public BusiException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public BusiException(int code, String msg, Throwable cause) {
        super(msg, cause);
        this.code = code;
    }

    public BusiException(BusinessCode businessCode) {
        super(businessCode.getValue());
        this.code = businessCode.getCode();
    }
}