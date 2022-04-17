package com.meet.markmeetadmin.common.http;

import lombok.*;
import org.springframework.http.HttpStatus;

/**
 * @author LianQianChao
 */
@Data
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class BaseResponse<T> {

    private int code;

    private String message;

    private T data;

    public BaseResponse(ResultCode resultCode,T data){
        new BaseResponse<>(resultCode.getCode(),resultCode.getMessage(),data);
    }
    
    public BaseResponse(ResultCode resultCode){
        new BaseResponse<>(resultCode,null);
    }
    
    public BaseResponse(T data){
        new BaseResponse<>(ResultCode.SUCCESS,data);
    }

    public BaseResponse(int code,String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
