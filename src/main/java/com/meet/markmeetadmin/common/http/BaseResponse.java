package com.meet.markmeetadmin.common.http;

import lombok.*;
import org.springframework.http.HttpStatus;

/**
 * @author LianQianChao
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class BaseResponse<T> {

    private Integer code;

    private String message;

    private T data;

    public BaseResponse(ResultCode resultCode,T data){
       this.code = resultCode.getCode();
       this.message = resultCode.getMessage();
       this.data = data;
    }

    public static <K> BaseResponse<K> success( String message, K data){
        return new BaseResponse<>(ResultCode.SUCCESS.getCode(), message,data);
    }

    public static <K> BaseResponse<K> success(String message){
        return new BaseResponse<>(ResultCode.SUCCESS.getCode(), message,null);
    }

    public static <K> BaseResponse<K> success(K data){
        return new BaseResponse<>(ResultCode.SUCCESS,data);
    }
}
