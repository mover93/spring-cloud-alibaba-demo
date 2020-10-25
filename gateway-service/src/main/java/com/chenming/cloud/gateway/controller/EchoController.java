package com.chenming.cloud.gateway.controller;

import org.springframework.http.HttpCookie;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: EchoController <br>
 * author: chenming <br>
 * date: 2020/10/24 22:57 <br>
 * version: 1.0 <br>
 */
@RestController
public class EchoController {

    @RequestMapping(value = "/echo")
    public String index(ServerHttpRequest request) {
        MultiValueMap<String, HttpCookie> cookies = request.getCookies();
        System.out.println(cookies);
        return "hello world!";
    }
}
