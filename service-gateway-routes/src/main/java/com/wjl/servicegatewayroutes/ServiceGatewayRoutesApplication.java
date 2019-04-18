package com.wjl.servicegatewayroutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceGatewayRoutesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGatewayRoutesApplication.class, args);
    }

}
