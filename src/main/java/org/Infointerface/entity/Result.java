package org.Infointerface.entity;

import org.eclipse.jetty.http.HttpStatus;

public class Result<T> {

    private Integer code; // 返回码
    private String message; // 返回消息
    private T data; // 返回数据

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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

    // 静态工具方法，便于快速构造结果
    public static <T> Result<T> success(T data) {
        return new Result<>(HttpStatus.OK_200, "success", data);
    }

    public static <T> Result<T> failure(String message) {
        return new Result<>(HttpStatus.INTERNAL_SERVER_ERROR_500, message, null);
    }
}
