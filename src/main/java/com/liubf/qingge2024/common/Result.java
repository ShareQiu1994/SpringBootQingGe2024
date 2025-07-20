package com.liubf.qingge2024.common;


import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;

/**
 * 统一返回结果类
 * @param <T> 返回数据的类型
 */
public class Result <T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    // 状态码
    private int code;
    // 消息
    private String message;
    // 数据
    private T data;

    // 构造方法
    public Result() {}

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 成功返回的静态方法


    public static <T> Result<T> success(T data) {
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<>(ResultCode.SUCCESS.getCode(), message, data);
    }

    public static <T> Result<T> success(HashMap<String, Object> map, T data) {
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(),data);
    }

    // 失败返回的静态方法
    public static <T> Result<T> error() {
        return new Result<>(ResultCode.ERROR.getCode(), ResultCode.ERROR.getMessage());
    }

    public static <T> Result<T> error(String message) {
        return new Result<>(ResultCode.ERROR.getCode(), message);
    }

    public static <T> Result<T> error(int code, String message) {
        return new Result<>(code, message);
    }

    // Getter 和 Setter 方法
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}