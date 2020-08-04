package com.service.provider.impl;

import com.service.provider.DemoService;

public class HelloWorld implements DemoService {
    @Override
    public void hello() {
        System.out.println("hello world");
    }
}
