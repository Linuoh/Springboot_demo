package com.example.spring.result;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String message;
    private T data;

    // Constructors, getters, and setters

    // Static method to create a successful response
    public static <T> Result<T> ok(T data) {
        return new Result<>(200, "OK", data);
    }

    // Static method to create an error response
    public static <T> Result<T> error(int code, String message) {
        return new Result<>(code, message, null);
    }

    // Constructor
    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}

