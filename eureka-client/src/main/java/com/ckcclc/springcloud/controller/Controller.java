package com.ckcclc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ckcclc on 28/10/2017.
 */

@RestController
public class Controller {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("name") String name) {
        return "hi, " + name + "! This is port: " + port;
    }
}
