package com.maple.web.api.User.controller;

import com.maple.common.model.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/1817:11
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UUID uuid;

    @RequestMapping("/getWorkId")
    @ResponseBody
    public String getWorkId() throws Exception {
       throw  new Exception("用户信息异常");
    }
}
