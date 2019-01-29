package com.maple.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Value("${server.port}")
    private int port;

    @RequestMapping("getApiInfo")
    public String index(){
        return "api data"+port;
    }
}
