package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther:GDC
 * @Date:2022/4/24 - 23:30
 * @Description:com.msb.controller
 * @version:1.0
 */
@Controller
public class FirstController {
    @RequestMapping("/firstController")
    @ResponseBody
    public String firstController(){
        return "hello springboot";
    }
}
