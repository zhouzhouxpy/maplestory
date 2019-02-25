package com.maple.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.maple.user.entity.User;
import com.maple.user.mapper.UserMapper;
import com.maple.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author maple
 * @since 2019-02-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    private UserMapper userMapper;

    @Override
    public List<User> getUserInfo() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("name","李雪松");
        return userMapper.selectList(queryWrapper);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }
}
