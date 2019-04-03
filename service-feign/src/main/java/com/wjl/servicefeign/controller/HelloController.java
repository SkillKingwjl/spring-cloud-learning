package com.wjl.servicefeign.controller;

import com.wjl.servicefeign.service.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    SchedualServiceHello schedualServiceHello;
    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam String name){
        return schedualServiceHello.sayHelloClient(name);
    }
}
