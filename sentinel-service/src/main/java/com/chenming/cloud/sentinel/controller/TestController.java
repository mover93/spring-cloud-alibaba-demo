package com.chenming.cloud.sentinel.controller;

import com.chenming.cloud.sentinel.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: TestController <br>
 * author: chenming <br>
 * date: 2020/9/26 16:12 <br>
 * version: 1.0 <br>
 */
@RestController
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping(value = "/hello/{name}")
    public String apiHello(@PathVariable String name) {
        return service.sayHello(name);
    }
}
