package com.ckcclc.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ckcclc on 28/10/2017.
 */

@Service
public class RemoteService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(String name) {
        return restTemplate.getForObject("http://hello/hello?name=" + name, String.class);
    }

    public String helloError(String name) {
        return "sorry, " + name;
    }

}
