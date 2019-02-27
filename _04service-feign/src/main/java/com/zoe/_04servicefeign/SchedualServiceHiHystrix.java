package com.zoe._04servicefeign;

import org.springframework.stereotype.Component;

@Component
/**
 * @author Bottle
 */
public class SchedualServiceHiHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Hystrix Error:"+name;
    }
}
