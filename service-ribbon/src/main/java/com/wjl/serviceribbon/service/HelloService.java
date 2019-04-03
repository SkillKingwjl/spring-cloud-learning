package com.wjl.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hello(String name){
        return restTemplate.getForObject("http://SERVER-HI/hi?name="+name,String.class);
    }
}
