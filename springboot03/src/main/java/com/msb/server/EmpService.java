package com.msb.server;

import com.msb.pojo.Emp;

import java.util.List;

/**
 * @Auther:GDC
 * @Date:2022/4/26 - 23:14
 * @Description:com.msb.server
 * @version:1.0
 */
public interface EmpService {
    List<Emp> findByPage(Integer pageNum, Integer pageSize);
    List<Emp> findAll();
}
