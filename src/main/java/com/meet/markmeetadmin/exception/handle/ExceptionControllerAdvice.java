package com.meet.markmeetadmin.exception.handle;

import com.meet.markmeetadmin.common.http.BaseResponse;
import com.meet.markmeetadmin.common.http.ResultCode;
import com.meet.markmeetadmin.exception.APIException;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author LianQianChao
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseResponse<String> MethodArgumentNotValidException(MethodArgumentNotValidException e){
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return new BaseResponse<>(ResultCode.VALIDATE_FAILED,objectError.getDefaultMessage());
    }

    @ExceptionHandler(APIException.class)
    public BaseResponse<String> APIException(APIException e){
        return new BaseResponse<>(e.getCode(),e.getMessage(),null);
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public BaseResponse<String> HttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e){
        return new BaseResponse<>(ResultCode.MEDIA_TYPE_NOT_SUPPORTED,"支持类型："+ e.getSupportedMediaTypes());
    }
}
