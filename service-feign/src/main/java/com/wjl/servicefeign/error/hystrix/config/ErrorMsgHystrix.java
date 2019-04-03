package com.wjl.servicefeign.error.hystrix.config;

import com.wjl.servicefeign.service.SchedualServiceHello;
import org.springframework.stereotype.Component;

@Component
public class ErrorMsgHystrix implements SchedualServiceHello {
    @Override
    public String sayHelloClient(String name) {
        return "服务器异常";
    }
}
