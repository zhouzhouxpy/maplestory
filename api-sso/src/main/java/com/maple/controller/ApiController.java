package com.maple.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Value("${server.port}")
    private int port;

    /**
     * @api {get} /index/:userName
     * @apiDescription  这只是一个测试的接口描述
     * @apiName index
     * @apiParam {String} userName 用户的姓名
     * @apiParam {Number} userAge 用户的年龄
     * @apiParamExample {json} Request-Example:
     * {
     *     "userName":"caojing",
     *     "userAge":12
     * }
     * @apiGroup index
     * @apiError userNotFound  The <code>id</code>
     * @apiSampleRequest /index
     */
    @RequestMapping("getApiInfo")
    public String index(){
        return "中文 api data"+port;
    }
}
