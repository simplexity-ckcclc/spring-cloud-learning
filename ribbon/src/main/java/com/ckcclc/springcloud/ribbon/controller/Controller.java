package com.ckcclc.springcloud.ribbon.controller;

import com.ckcclc.springcloud.configserver.service.RemoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ckcclc on 28/10/2017.
 */

@RestController
public class Controller {

    @Autowired
    private RemoteService remoteService;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("name") String name) {
        return "This is ribbon. " + remoteService.hello(name);
    }
}
