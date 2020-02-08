package com.grady.apache.dubbo.provider.service.impl;

import com.grady.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String echo(String str) {
        return "rpc call: echo : " + str + " my port: " + port;
    }
}
