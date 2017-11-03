package com.ckcclc.springcloud.feign.service;

import com.ckcclc.springcloud.feign.service.RemoteService;
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
