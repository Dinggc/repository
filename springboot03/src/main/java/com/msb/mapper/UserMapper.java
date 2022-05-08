package com.msb.mapper;

import com.msb.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther:GDC
 * @Date:2022/4/26 - 20:55
 * @Description:com.msb.mapper
 * @version:1.0
 */
@Mapper
public interface UserMapper {
    List<User> findAll();

}
