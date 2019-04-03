package com.wjl.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVER-HI")
public interface SchedualServiceHello {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHelloClient(@RequestParam(value = "name") String name);
}
