package com.shaojie.springcloud.test.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ShaoJie
 * @Date 2019/11/6
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String hi(String message) {
        return String.format("Hi，your message is : %s i am from port : %s", message, port);
    }


}
