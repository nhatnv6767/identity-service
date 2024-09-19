package com.devteria.identity_service.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;


// xoa dong message = null
// nghia la field nao null thi khong chen vao Json
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    // vi du code = 1000 => thanh cong
    private int code = 1000;
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
