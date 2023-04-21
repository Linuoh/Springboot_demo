package com.example.test.Result;

import lombok.Getter;

/**
 * @author lxl
 * 统一返回结果状态信息类
 */
@Getter
public enum ResultCodeEnum {

    //统一结果返回枚举
    SUCCESS(200,"成功"),
    FAIL(201, "失败"),
    PARAM_ERROR( 202, "参数不正确");


    private final Integer code;
    private final String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
