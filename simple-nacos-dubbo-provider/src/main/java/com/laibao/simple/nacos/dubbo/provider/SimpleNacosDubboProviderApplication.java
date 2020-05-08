package com.laibao.simple.nacos.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableAutoConfiguration
public class SimpleNacosDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleNacosDubboProviderApplication.class);
    }
}
