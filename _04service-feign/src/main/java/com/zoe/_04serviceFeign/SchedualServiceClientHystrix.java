package com.zoe._04serviceFeign;

import org.springframework.stereotype.Component;

/**
 * @author Bottle
 */
@Component
public class SchedualServiceClientHystrix implements SchedualServiceClient {
    @Override
    public String clientFromClientOne(String name) {
        return "Hystrix Error:"+name;
    }

}
