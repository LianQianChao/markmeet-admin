package com.meet.markmeetadmin.exception;

import com.meet.markmeetadmin.common.http.ResultCode;
import lombok.Getter;

/**
 * @author LianQianChao
 */
@Getter
public class APIException extends RuntimeException{

    private final int code;
    private final String message;

    public APIException(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }
}
