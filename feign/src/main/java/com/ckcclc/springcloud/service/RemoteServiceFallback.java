package com.ckcclc.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * Created by ckcclc on 29/10/2017.
 */
@Component
public class RemoteServiceFallback implements RemoteService {

    @Override
    public String remoteHello(String name) {
        return "sorry, " + name;
    }
}
