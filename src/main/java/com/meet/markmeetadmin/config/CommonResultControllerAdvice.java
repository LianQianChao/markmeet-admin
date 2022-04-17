package com.meet.markmeetadmin.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meet.markmeetadmin.common.http.BaseResponse;
import com.meet.markmeetadmin.common.http.ResultCode;
import com.meet.markmeetadmin.exception.APIException;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;



/**
 * @author LianQianChao
 */
@ControllerAdvice("com.meet.markmeetadmin.controller")
public class CommonResultControllerAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        //判断接口是否为BaseResponse，接口返回BaseResponse类型没必要其他操作
        return !returnType.getGenericParameterType().equals(BaseResponse.class);
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        //String类型不能直接包装,需要特殊处理
        if(returnType.getGenericParameterType().equals(String.class)){
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                return objectMapper.writeValueAsString(new BaseResponse<>(body));
            }catch (JsonProcessingException e){
                //返回类型错误
                throw new APIException(ResultCode.RETURN_TYPE_ERROR);
            }
        }
        return new BaseResponse<>(body);
    }
}
