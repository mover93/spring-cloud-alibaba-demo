package com.chenming.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description: DubboConsumerApplication <br>
 * author: chenming <br>
 * date: 2020/9/26 21:05 <br>
 * version: 1.0 <br>
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
