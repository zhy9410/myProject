package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RunApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
        System.out.println("-----------注册中心启动------------");
    }
}
