package com.example.microservice.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangtao on 2016/11/3.
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class UserApplication {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
