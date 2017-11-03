package com.ckcclc.springcloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ckcclc on 28/10/2017.
 */

@FeignClient(value = "hello", fallback = RemoteServiceFallback.class)
public interface RemoteService {

    @RequestMapping(value = "/hello")
    String remoteHello(@RequestParam("name") String name);
}
