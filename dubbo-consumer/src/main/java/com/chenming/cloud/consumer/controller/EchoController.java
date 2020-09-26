package com.chenming.cloud.consumer.controller;

import com.chenming.cloud.api.EchoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: EchoController <br>
 * author: chenming <br>
 * date: 2020/9/26 21:08 <br>
 * version: 1.0 <br>
 */
@RestController
public class EchoController {

    @DubboReference
    private EchoService echoService;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable String message) {
        return echoService.echo(message);
    }
}
