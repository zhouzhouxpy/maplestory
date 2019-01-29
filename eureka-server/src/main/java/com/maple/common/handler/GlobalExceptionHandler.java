package com.maple.common.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: GlobalExceptionHandler
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/26 21:52
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception{
        return e.getMessage();
    }
}
