package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RunConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(RunConsumerFeign.class, args);
        System.out.println("---------------feign消费方启动---------------");
    }
}
