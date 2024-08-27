package com.samin.mbox.admin.config;

import com.samin.mbox.common.exception.BusiException;
import com.samin.mbox.common.vo.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public BaseResponse<Void> exception(Exception e) {
        log.error("系统内部错误：", e);
        return BaseResponse.fail(-1, e.getMessage());
    }

    @ExceptionHandler(BusiException.class)
    @ResponseStatus(HttpStatus.OK)
    public BaseResponse<Void> runtimeException(BusiException e) {
        log.error("BusException：", e);
        return BaseResponse.fail(e.getCode(), e.getMessage());
    }
}
