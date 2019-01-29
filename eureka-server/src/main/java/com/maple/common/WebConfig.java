package com.maple.common;

import com.maple.common.interceptor.ApiInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @ClassName: WebConfig
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/26 19:11
 */
//@SpringBootConfiguration
public class WebConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new ApiInterceptor());
    }
}
