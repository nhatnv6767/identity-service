package com.devteria.identity_service.dto.request;


public class ApiResponse<T> {
    private int code;
    private String message;
    // kieu tra ve co the thay doi
    // phu thuoc vao tung api
    private T result;

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

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
