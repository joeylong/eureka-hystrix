package com.eureka.hystrix.service.impl;

import com.eureka.hystrix.service.IConsumerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerServiceImpl implements IConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
        return restTemplate.getForObject("http://eureka-producer/producer",String.class);
    }

    @Override
    public String fallback() {
        return "fallback";
    }
}
