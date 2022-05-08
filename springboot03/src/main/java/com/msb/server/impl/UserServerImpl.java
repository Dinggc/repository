package com.msb.server.impl;

import com.msb.mapper.UserMapper;
import com.msb.pojo.User;
import com.msb.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:GDC
 * @Date:2022/4/26 - 21:01
 * @Description:com.msb.server.impl
 * @version:1.0
 */
@Service
public class UserServerImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
