package com.meet.markmeetadmin.common.http;

import lombok.Getter;

/**
 * @author LianQianChao
 */
@Getter
public enum ResultCode {

    SUCCESS(2000, "操作成功"),
    ADD_SUCCESS(2001,"添加成功"),
    DELETE_SUCCESS(2002,"删除成功"),
    UPDATE_SUCCESS(2003,"修改成功"),


    FAILED(4000, "操作失败"),
    ADD_FAILED(4001,"添加失败"),
    DELETE_FAILED(4002,"删除失败"),
    UPDATE_FAILED(4003,"修改失败"),
    VALIDATE_FAILED(4004,"参数校验失败"),

    ERROR(5000,"未知错误");


    private final Integer code;

    private final String message;

    ResultCode(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
