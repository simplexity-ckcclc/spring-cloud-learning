package com.ckcclc.springcloud.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ckcclc on 28/10/2017.
 */

@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
