package com.ckcclc.springcloud.feign.controller;

import com.ckcclc.springcloud.feign.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ckcclc on 28/10/2017.
 */

@RestController
@RefreshScope
public class Controller {

    @Autowired
    private RemoteService remoteService;

    @Value("${foo}")
    private String value;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("name") String name) {
        return "This is feign. " + remoteService.remoteHello(name);
    }

    @RequestMapping(value = "/config")
    public String config() {
        return value;
    }
}
