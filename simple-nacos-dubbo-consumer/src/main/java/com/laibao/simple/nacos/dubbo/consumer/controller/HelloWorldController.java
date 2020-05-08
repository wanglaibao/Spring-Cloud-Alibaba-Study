package com.laibao.simple.nacos.dubbo.consumer.controller;

import com.laibao.simple.nacos.dubbo.api.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

    @Reference
    HelloService helloService;

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable String name) {
        return helloService.sayHello(name);
    }
}
