package com.meet.markmeetadmin.exception;

import com.meet.markmeetadmin.common.http.BaseResponse;
import com.meet.markmeetadmin.common.http.ResultCode;
import org.springframework.validation.ObjectError;
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
}
