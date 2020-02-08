package com.grady.apache.dubbo.consume.controller;

import com.grady.apache.dubbo.consume.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class RestFeignController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable("str") String str) {
        return helloService.echo(str);
    }
}
