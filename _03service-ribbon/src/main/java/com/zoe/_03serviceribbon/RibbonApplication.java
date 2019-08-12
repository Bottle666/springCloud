package com.zoe._03serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Bottle
 * ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。Feign默认集成了ribbon
 * 在工程的启动类中,通过@EnableDiscoveryClient向服务中心注册；
 * 并且向程序的ioc注入一个bean: restTemplate;
 * 并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
public class RibbonApplication {
    /**
     * 一个服务注册中心，eureka server,端口为8761
     * service-hi工程跑了两个实例，端口分别为8762,8763，分别向服务注册中心注册
     * sercvice-ribbon端口为8764,向服务注册中心注册
     * 当sercvice-ribbon通过restTemplate调用service-hi的hi接口时，因为用ribbon进行了负载均衡，会轮流的调用service-hi：8762和8763 两个端口的hi接口；
     *
     * 在ribbon使用断路器
     * 1. 首先在pox.xml文件中加入spring-cloud-starter-netflix-hystrix的起步依赖
     * 2. 在程序的启动类ServiceRibbonApplication 加@EnableHystrix注解开启Hystrix：
     * 3. 在hiService方法上加上@HystrixCommand注解
     * 4. 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
