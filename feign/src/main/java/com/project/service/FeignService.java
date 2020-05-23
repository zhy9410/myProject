package com.project.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@FeignClient("provider01")
public interface FeignService {
    @RequestMapping("/hello")
    String showInfo();
}
