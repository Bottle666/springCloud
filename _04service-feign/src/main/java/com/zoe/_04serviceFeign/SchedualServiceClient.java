package com.zoe._04serviceFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "service-client",fallback = SchedualServiceClientHystrix.class)
public interface SchedualServiceClient {

    @RequestMapping(value = "/client",method = RequestMethod.GET)
    String clientFromClientOne(@RequestParam(value = "name") String name);
}


