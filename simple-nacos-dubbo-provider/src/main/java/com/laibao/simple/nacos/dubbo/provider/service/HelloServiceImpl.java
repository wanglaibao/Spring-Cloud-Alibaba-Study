package com.laibao.simple.nacos.dubbo.provider.service;

import com.laibao.simple.nacos.dubbo.api.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "你好 " + name + "欢迎来到金戈的Dubbo服务提供者世界";
    }
}
