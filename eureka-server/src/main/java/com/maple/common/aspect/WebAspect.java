package com.maple.common.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName: WebAspect
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/26 20:40
 */
//@aspect
//@Component
public class WebAspect {
    private static final Logger logger = LoggerFactory.getLogger(WebAspect.class);
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    private void webPointcut() {
    }
    @AfterThrowing(pointcut = "webPointcut()",throwing = "e")
    public void handleThrowing(Exception e){
        e.printStackTrace();
        logger.error("异常信息:"+e.getMessage());
        writeContent("系统异常");
    }

    private void writeContent(String content) {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getResponse();
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type", "text/plain;charset=UTF-8");
        response.setHeader("icop-content-type", "exception");
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.print(content);
        writer.flush();
        writer.close();
    }
}
