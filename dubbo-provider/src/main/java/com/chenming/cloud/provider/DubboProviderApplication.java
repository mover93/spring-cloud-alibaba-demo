package com.chenming.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description: DubboProviderApplication <br>
 * author: chenming <br>
 * date: 2020/9/26 20:49 <br>
 * version: 1.0 <br>
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
