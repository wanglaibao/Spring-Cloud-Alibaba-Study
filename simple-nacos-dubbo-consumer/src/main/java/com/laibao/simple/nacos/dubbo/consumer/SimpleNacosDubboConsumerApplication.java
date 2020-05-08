package com.laibao.simple.nacos.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SimpleNacosDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleNacosDubboConsumerApplication.class, args);
    }

}
