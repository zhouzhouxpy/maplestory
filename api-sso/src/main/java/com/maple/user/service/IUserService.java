package com.maple.user.service;

import com.maple.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author maple
 * @since 2019-02-25
 */
public interface IUserService extends IService<User> {

    List<User> getUserInfo();

    void insertUser(User user);
}
