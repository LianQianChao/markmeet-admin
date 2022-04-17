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
        this(resultCode.getCode(),resultCode.getMessage(),data);
    }
    
    public BaseResponse(ResultCode resultCode){
       this(resultCode,null);
    }
    
    public BaseResponse(T data){
        this(ResultCode.SUCCESS,data);
    }

    public BaseResponse(int code,String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
