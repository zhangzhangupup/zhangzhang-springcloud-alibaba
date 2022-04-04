package com.zhang.advice;

import com.zhang.result.resultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author zhangKeChen
 * @Date 2022/3/29 11:26
 * 全局异常的捕获处理
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = Exception.class)
    public resultResponse<String> handleCommonException(HttpServletRequest request,Exception e){
        resultResponse<String> response =new resultResponse<>(-1,"系统异常");
        response.setData(e.getMessage());
        log.error("commerce server has error [{}]",e.getMessage(),e);
       return response;
    }
}
