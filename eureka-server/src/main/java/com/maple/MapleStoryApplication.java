package com.maple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.cors.CorsConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: MapleStoryApplication
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/1811:25
 */
@SpringBootApplication
@EnableSwagger2
@EnableEurekaServer
public class MapleStoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(MapleStoryApplication.class, args);
    }
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 1 设置访问源地址
//        corsConfiguration.addAllowedOrigin("http://test.huashunhro.cn/");//设置多个访问源
        corsConfiguration.addAllowedHeader("*"); // 2 设置访问源请求头
        corsConfiguration.addAllowedMethod("*"); // 3 设置访问源请求方法
        return corsConfiguration;
    }

    /*@Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 4 对接口配置跨域设置
        return new CorsFilter(source);
    }*/
}
