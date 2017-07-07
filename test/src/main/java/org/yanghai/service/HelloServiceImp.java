package org.yanghai.service;

import org.yanghai.interfaces.IHelloService;

/**
 * Created by yh on 17-7-5.
 */
public class HelloServiceImp implements IHelloService {
    public String helloWorld(String message) {
        return "hello "+message;
    }
}
