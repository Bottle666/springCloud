package com.zoe._05servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Bottle
 *
 * Zuul的主要功能是路由转发和过滤器。
 * 路由功能是微服务的一部分，比如／api/user转发到到user服务，/api/shop转发到到shop服务。
 * zuul默认和Ribbon结合实现了负载均衡的功能。
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ZuulApplication {
    /**
     * zuul路由转发
     * 1. 引入依赖
     * 2. 在其入口applicaton类加上注解@EnableZuulProxy，开启zuul的功能
     * 3. 加上配置文件application.yml
     *
     * zuul服务过滤
     * zuul不仅只是路由，并且还能过滤，做一些安全验证
     * 1. 创建类集成ZuulFilter即可
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

}
