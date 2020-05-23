package com.project.controller;

import com.project.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;
    @ResponseBody
    @RequestMapping("showInfo")
    public String showInfo(){
        return helloService.showInfo();
    }
}
