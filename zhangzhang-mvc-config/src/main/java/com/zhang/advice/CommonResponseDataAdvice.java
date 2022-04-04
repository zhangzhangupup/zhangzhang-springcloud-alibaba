package com.zhang.advice;

import com.zhang.annotation.IgnoreResponseAdvice;
import com.zhang.result.resultResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @Author zhangKeChen
 * @Date 2022/3/29 11:05
 * 实现同意响应
 */
@RestControllerAdvice(value = "com.zhang")
public class CommonResponseDataAdvice implements ResponseBodyAdvice<Object> {
    /**
     * 判断是否需要对响应进行处理
     * @param methodParameter
     * @param aClass
     * @return
     */
    @Override
    @SuppressWarnings("all")
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        /**
         * 如果当前类(controller)被IgnoreResponseAdvice注解标识了，就不进行处理
         */
        if (methodParameter.getDeclaringClass().isAnnotationPresent(IgnoreResponseAdvice.class)){
            return false;
        }
        /**
         * 如果当前方法被IgnoreResponseAdvice注解标识了，就不进行处理
         */
        if (methodParameter.getMethod().isAnnotationPresent(IgnoreResponseAdvice.class)){
            return false;
        }
        return true;
    }

    @Override
    @SuppressWarnings("all")
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
//         定义最终返回对象
        resultResponse response=new  resultResponse<>(0,"");
        if (null == o){
            return response;
        }else if (o instanceof resultResponse){
            response = (resultResponse<Object>) o;
        }else{
            response.setData(o);
        }
        return response;
    }
}
