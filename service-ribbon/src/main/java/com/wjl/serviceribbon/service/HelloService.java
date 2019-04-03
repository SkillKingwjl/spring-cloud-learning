package com.wjl.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloErr")
    public String hello(String name){
        return restTemplate.getForObject("http://SERVER-HI/hi?name="+name,String.class);
    }

    public String helloErr(String name){
        return "调用服务出错";
    }
}
