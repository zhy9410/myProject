package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@SpringBootConfiguration
public class RunConsumer01 {
    public static void main(String[] args) {
        SpringApplication.run(RunConsumer01.class, args);
        System.out.println("------------消费方01启动--------------");
    }
}
