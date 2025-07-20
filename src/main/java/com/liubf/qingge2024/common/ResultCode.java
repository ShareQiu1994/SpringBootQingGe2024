package com.liubf.qingge2024.common;

/**
 * 返回状态码枚举
 */
public enum ResultCode {
    SUCCESS(200, "操作成功"),
    ERROR(500, "操作失败"),
    VALIDATE_FAILED(400, "参数校验失败"),
    UNAUTHORIZED(401, "未登录或 token 已过期"),
    FORBIDDEN(403, "没有相关权限");

    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}