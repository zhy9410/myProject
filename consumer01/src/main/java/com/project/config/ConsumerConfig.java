package com.project.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        System.out.println("restTemplatec创建成功！！！");
        return new RestTemplate();
    }

}
