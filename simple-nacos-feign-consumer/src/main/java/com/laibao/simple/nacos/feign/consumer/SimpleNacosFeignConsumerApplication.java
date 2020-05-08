package com.laibao.simple.nacos.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.laibao.simple.nacos.feign.consumer.service"})
public class SimpleNacosFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleNacosFeignConsumerApplication.class, args);
    }
}
