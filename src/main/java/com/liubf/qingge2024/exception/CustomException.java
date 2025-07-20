package com.liubf.qingge2024.exception;

public class CustomException extends   RuntimeException{

    private Integer code;
    private String message;

    public CustomException(String message){
        super(message);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CustomException(Integer code, String message){
        this.code =code;
        this.message=message;
    }


}
