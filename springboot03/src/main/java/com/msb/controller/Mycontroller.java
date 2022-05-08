package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther:GDC
 * @Date:2022/4/25 - 20:56
 * @Description:com.msb.controller
 * @version:1.0
 */
@Controller
public class Mycontroller {
    @RequestMapping("springboot")
    @ResponseBody
    public String test03(){
        return" Hello SpringBoot";
    }
}
