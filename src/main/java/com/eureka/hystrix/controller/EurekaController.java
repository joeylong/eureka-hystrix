package com.eureka.hystrix.controller;

import com.eureka.hystrix.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {

    @Autowired
    private IConsumerService consumerService;
    ;

    @GetMapping("/consumer")
    public String consumer(){
        return consumerService.consumer();
    }
}
