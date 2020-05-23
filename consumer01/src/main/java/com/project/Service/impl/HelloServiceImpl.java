package com.project.Service.impl;

import com.project.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String showInfo() {
        return restTemplate.getForObject("http://provider01/hello",String.class);
    }
}
