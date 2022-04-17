package com.meet.markmeetadmin.common.http;

import lombok.Getter;

/**
 * @author LianQianChao
 */
@Getter
public enum ResultCode {

    SUCCESS(2000, "操作成功"),

    FAILED(4000, "操作失败"),
    ADD_FAILED(4001,"添加失败"),
    DELETE_FAILED(4002,"删除失败"),
    UPDATE_FAILED(4003,"修改失败"),
    VALIDATE_FAILED(4004,"参数校验失败"),
    RETURN_TYPE_ERROR(4005,"返回类型错误"),

    ERROR(5000,"未知错误");


    private final int code;

    private final String message;

    ResultCode(int code, String message){
        this.code = code;
        this.message = message;
    }
}
