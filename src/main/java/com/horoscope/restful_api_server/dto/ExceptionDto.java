package com.horoscope.restful_api_server.dto;

public class ExceptionDto {
    private String msg;

    public ExceptionDto(){}

    public ExceptionDto(String msg) {
        this.msg = msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
