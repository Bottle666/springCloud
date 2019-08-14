package com.zoe._03serviceRibbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * @author Bottle
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "clientError")
    public String clientService(String name) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/client?name="+name,String.class);
    }
    public String clientError(String name) {
        return "client,"+name+",sorry,error!";
    }

}
