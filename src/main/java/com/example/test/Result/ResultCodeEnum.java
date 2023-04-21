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
    PARAM_ERROR( 202, "参数不正确"),
    GOODS_SHELFS_EXIST_ERROR(203,"货架或商品不存在"),
    GOODS_SHELFS_STATUS_ERROR(204,"货架已使用或货物已入库"),

    GOODS_ID_ERROR_OR_GOODS_REPO_NULL(205,"商品id错误或商品售罄"),

    ORDERS_EMPTY_OR_CANCEL(206,"订单不存在或已被取消");


    private final Integer code;
    private final String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
