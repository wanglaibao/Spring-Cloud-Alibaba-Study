package com.laibao.simple.nacos.feign.consumer.controller;

import com.laibao.simple.nacos.feign.consumer.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/", produces = "application/json")
    public String home() {
        log.info("-----------------consumer调用开始-----------------");
        String param = "前程";
        log.info("消费者传递参数：" + param);
        String result = helloService.hello(param);
        log.info("收到提供者响应：" + result);
        return "feign消费者" + result;
    }
}
