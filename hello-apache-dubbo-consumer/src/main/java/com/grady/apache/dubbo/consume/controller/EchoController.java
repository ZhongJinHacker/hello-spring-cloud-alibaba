package com.grady.apache.dubbo.consume.controller;

import com.grady.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable("str") String str) {
        return echoService.echo(str);
    }
}
