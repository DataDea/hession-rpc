package org.yanghai.client;

import com.caucho.hessian.client.HessianProxyFactory;
import org.yanghai.interfaces.IHelloService;

/**
 * Created by yh on 17-7-5.
 */
public class HelloServerMian {
    public static void main(String[] args) throws Exception {
        String url = "http://localhost:8080/hessian";
//        System.out.println(url);
        HessianProxyFactory factory = new HessianProxyFactory();
        IHelloService helloService = (IHelloService) factory.create(IHelloService.class,url);
        System.out.println(helloService.helloWorld("hession rpc demo!!!"));
    }
}
