package com.zoe._04serviceFeign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bottle
 */
@RestController
public class ClientController {

    /**
     * 编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
     */
    @Autowired
    SchedualServiceClient schedualServiceClient;

    @GetMapping(value = "/client")
    public String client(@RequestParam String name) {
        System.out.println("Feign...");
        return schedualServiceClient.clientFromClientOne(name);
    }
}

