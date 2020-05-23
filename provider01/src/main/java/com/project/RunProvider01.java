package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RunProvider01 {
    public static void main(String[] args) {
        SpringApplication.run(RunProvider01.class, args);
        System.out.println("--------------服务提供方01启动-------------");
    }
}
