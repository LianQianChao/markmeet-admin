package com.meet.markmeetadmin.common;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;

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

    public static <K> BaseResponse<K> ok( String message, K data){
        return new BaseResponse<>(HttpStatus.OK.value(),message,data);
    }

    public static <K> BaseResponse<K> ok(String message){
        return new BaseResponse<>(HttpStatus.OK.value(), message,null);
    }

    public static <K> BaseResponse<K> ok(K data){
        return new BaseResponse<>(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),data);
    }
}
