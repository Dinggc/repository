package com.msb.controller;

import com.msb.pojo.Emp;
import com.msb.server.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther:GDC
 * @Date:2022/4/27 - 22:51
 * @Description:com.msb.controller
 * @version:1.0
 */
@RestController
@RequestMapping("freemarker")
public class FreemarkerController {
    @Autowired
    private EmpService empService;
    /*@RequestMapping("ok")
    public String freemarker(Map<String,Object> map){
        map.put("name" ,"菊花");
        return "show";
    }*/

    //@ResponseBody
    @RequestMapping("/showEmp")
    public ModelAndView testList(){
        ModelAndView mv =new ModelAndView();
        List<Emp> list =empService.findAll();
        mv.addObject("empList", list);
        mv.setViewName("showEmps");
        return mv;
    }
    @RequestMapping("/showMap")
    public ModelAndView testMap(){
        ModelAndView modelAndView = new ModelAndView();
        List<Emp> all = empService.findAll();
        Map<String,Object> map = new HashMap<>();
        for (Emp emp: all) {
            map.put(emp.getEmpno().toString(),emp);
        }
        modelAndView.addObject("empMap",map);
        modelAndView.setViewName("showMap");
        return modelAndView;

    }
}



