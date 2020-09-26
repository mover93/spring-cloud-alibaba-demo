package com.chenming.cloud.provider.service;

import com.chenming.cloud.api.EchoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * description: EchoServiceImpl <br>
 * author: chenming <br>
 * date: 2020/9/26 20:54 <br>
 * version: 1.0 <br>
 */
@DubboService
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String message) {
        return "hello" + message;
    }
}
