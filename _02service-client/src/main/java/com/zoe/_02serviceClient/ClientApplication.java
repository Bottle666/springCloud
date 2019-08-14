package com.zoe._02serviceClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Bottle
 * 1.添加依赖 spring-cloud-starter-netflix-eureka-client
 * 2.通过注解 @EnableEurekaClient 表明自己是一个eurekaclient.
 * 3.添加配置文件 application.yml
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
