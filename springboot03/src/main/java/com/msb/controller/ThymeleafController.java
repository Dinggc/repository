package com.msb.controller;

import com.msb.pojo.Emp;
import com.msb.server.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Auther:GDC
 * @Date:2022/4/28 - 23:51
 * @Description:com.msb.controller
 * @version:1.0
 */
@Controller
public class ThymeleafController {
    @Autowired
    private EmpService empService;
    @RequestMapping("showIndex")
    public String  showIndex(Map<String,Object> map){
        map.put("msg", "testMessage");
        map.put("name","菊花");
        return "index";
    }

    @RequestMapping("showEmp")
    public String showEmp(Map<String,Object> map){
        List<Emp> all = empService.findAll();
        map.put("emp",all.get(0));
        return "showEmps";
    }
}