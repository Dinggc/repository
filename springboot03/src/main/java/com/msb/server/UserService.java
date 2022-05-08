package com.msb.server;

import com.msb.pojo.User;

import java.util.List;

/**
 * @Auther:GDC
 * @Date:2022/4/26 - 21:00
 * @Description:com.msb.server
 * @version:1.0
 */
public interface UserService {
    List<User> findAll();
}
