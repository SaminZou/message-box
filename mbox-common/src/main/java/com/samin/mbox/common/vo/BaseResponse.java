package com.samin.mbox.common.vo;

import lombok.Data;

@Data
public class BaseResponse<T> {

    private int code;
    private String msg;
    private T data;

    public static <T> BaseResponse<T> success(T data) {
        BaseResponse<T> resp = new BaseResponse<>();
        resp.setCode(0);
        resp.setMsg("success");
        resp.setData(data);
        return resp;
    }

    public static BaseResponse<Void> success() {
        BaseResponse<Void> resp = new BaseResponse<>();
        resp.setCode(0);
        resp.setMsg("success");
        resp.setData(null);
        return resp;
    }

    public static BaseResponse<Void> fail(int code, String msg) {
        BaseResponse<Void> resp = new BaseResponse<>();
        resp.setCode(code);
        resp.setMsg(msg);
        resp.setData(null);
        return resp;
    }
}