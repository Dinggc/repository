package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther:GDC
 * @Date:2022/4/25 - 20:32
 * @Description:com.msb.controller
 * @version:1.0
 */
@Controller
public class MyController {

    @ResponseBody
    @RequestMapping("second")
    public String Test(){
        return "hello springboot";
    }
}
