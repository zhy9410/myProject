package com.project.controller;

import com.project.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    private FeignService feignService;
    @RequestMapping("/info")
    @ResponseBody
    public String getInfo(){
        return feignService.showInfo();
    }
}
