package com.zoe._04serviceFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Bottle
 * Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。
 * 使用Feign，只需要创建一个接口并注解。
 * 它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。
 * Feign支持可插拔的编码器和解码器。
 * Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
 * 简而言之：
 *
 * Feign 采用的是基于接口的注解
 * Feign 整合了ribbon，具有负载均衡的能力
 * 整合了Hystrix，具有熔断的能力
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {
    /**
     * 1.引入 Feign的起步依赖spring-cloud-starter-feign、
     * 2.引入 Eureka的起步依赖spring-cloud-starter-netflix-eureka-client、
     * 3.配置 application.yml文件
     * 4.在程序的启动类ServiceFeignApplication ，加上@EnableFeignClients注解开启Feign的功能：
     * 5.定义一个feign接口，通过@FeignClient("服务名")
     *
     * Feign中使用断路器
     * 1.Feign是自带断路器的，在D版本的Spring Cloud之后，它没有默认打开 详见application.yml
     * 2.FeignClient的SServiceclient接口的注解中加上fallback的指定类即可
     *      @FeignClient(value = "service-client",fallback = SchedualServiceclientHystric.class)
     * 3.SchedualServiceclientHystric需要实现SchedualServiceclient 接口，并注入到Ioc容器中
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

}
