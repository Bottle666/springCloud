package com.zoe._02servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bottle
 * 1.添加依赖 spring-cloud-starter-netflix-eureka-client
 * 2.通过注解 @EnableEurekaClient 表明自己是一个eurekaclient.
 * 3.添加配置文件 application.yml
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "Bottle") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }


}
