package com.grady.apache.dubbo.provider.service.impl;

import com.grady.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String str) {
        return "rpc call: echo : " + str;
    }
}
