package com.maple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author lixuesong
 * @Description //TODO
 * @Date 10:12 2019/2/12
 * 
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GetwayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetwayApplication.class, args);
    }
}
