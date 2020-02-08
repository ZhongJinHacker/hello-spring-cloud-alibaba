package com.grady.apache.dubbo.consume.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 使用Feign 来请求的接口，默认使用 轮询 负载均衡方式
 */

@FeignClient(name = "hello-dubbo-provider")
public interface HelloService {

    @GetMapping(value = "/hello/echo/{str}")
    String echo(@PathVariable("str") String str);
}
