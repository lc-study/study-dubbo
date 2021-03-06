package com.lc.dubbo.component;

import com.lc.dubbo.service.HelloService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("helloContract2")
public class HelloContractImpl2 extends HelloContractImpl1 {
    @Resource
    private HelloService helloService;

    @Override
    public String sayHello(String name) {
        return helloService.sayHello(name + "2");
    }
}
