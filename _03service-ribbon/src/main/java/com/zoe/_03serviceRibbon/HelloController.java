package com.zoe._03serviceRibbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bottle
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/ribbon-client")
    public String client(@RequestParam String name) {
        return helloService.clientService(name);
    }
}