package com.zouhm.hession.service.impl;

import com.zouhm.hession.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService{
    @Override
    public String testPrintFirstApi() {
        System.out.println("test my first api");
        return "test completed!";
    }
}
