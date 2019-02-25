package com.maple.user.controller;


import com.maple.user.entity.User;
import com.maple.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author maple
 * @since 2019-02-25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getUserInfo")
    public List<User> getUserInfo(){
        return userService.getUserInfo();
    }

    @PostMapping("/insert")
    public void insertUser(){
        User user = new User();
        user.setAge(29);
        user.setName("李雪松");
        user.setCorpId(0000);
        user.setPassword("123");
        user.setPhone(1372111111);
        userService.insertUser(user);
    }

}

