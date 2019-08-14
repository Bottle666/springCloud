package com.zoe._02serviceClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {
    @Value("${server.port}")
    String port;

    @GetMapping("/client")
    public String client(@RequestParam(value = "name", defaultValue = "Bottle") String name) {
        return "client :" + name + " ,I'am from port:" + port;
    }

}
