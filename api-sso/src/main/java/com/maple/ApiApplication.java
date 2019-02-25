package com.maple;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author lixuesong
 * @Description //TODO
 * @Date 10:11 2019/2/12
 *
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@MapperScan("com.maple.*.mapper")
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
