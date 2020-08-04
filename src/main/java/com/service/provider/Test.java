package com.service.provider;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Test {
    public static void main(String[] args) {
        ServiceLoader<DemoService> serviceLoader = ServiceLoader.load(DemoService.class);
        Iterator<DemoService> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            iterator.next().hello();
        }
    }
}
