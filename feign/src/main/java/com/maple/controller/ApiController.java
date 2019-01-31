package com.maple.controller;

import com.maple.service.ApiService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ApiController
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/30 17:34
 */
@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @RequestMapping("index")
    @HystrixCommand(fallbackMethod = "error")
    public String index(){
        return apiService.index();
    }

    public String error(){
        return "熔断";
    }
}
