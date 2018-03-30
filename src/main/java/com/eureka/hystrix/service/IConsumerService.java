package com.eureka.hystrix.service;

public interface IConsumerService {
    String consumer();
    String fallback();
}
