package com.chenming.cloud.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * description: TestService <br>
 * author: chenming <br>
 * date: 2020/9/26 16:11 <br>
 * version: 1.0 <br>
 */
@Service
public class TestService {

    @SentinelResource(value = "sayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
