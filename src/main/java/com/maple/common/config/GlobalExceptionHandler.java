package com.maple.common.config;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@Author:lixuesong
 *@Description 全局异常处理
 *@Date： 2018-4-4
 *@Modified By：
 */

@ControllerAdvice
public class GlobalExceptionHandler {
    Logger logger = Logger.getLogger(GlobalExceptionHandler.class);

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public void handleException(Exception e) {

        logger.error(e.getMessage(),e);  // 记录错误信息
    }
}
