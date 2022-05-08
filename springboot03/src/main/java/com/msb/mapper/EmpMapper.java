package com.msb.mapper;

import com.msb.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther:GDC
 * @Date:2022/4/26 - 23:16
 * @Description:com.msb.mapper
 * @version:1.0
 */
@Mapper
public interface EmpMapper {
    List<Emp> findAll();
}
