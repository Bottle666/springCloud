package com.zoe._01eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Bottle
 * eureka是一个服务注册和发现模块
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
    /**
     * 1.添加依赖 spring-cloud-starter-netflix-eureka-server
     * 2.配置 application.yml
     * 3.添加注解 @EnableEurekaServer 表明自己是一个eurekaServer
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
