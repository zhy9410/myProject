package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWordController {
    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello world ！";
    }
}
