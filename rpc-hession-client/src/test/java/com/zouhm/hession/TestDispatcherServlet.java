package com.zouhm.hession;

import com.caucho.hessian.client.HessianProxyFactory;
import com.zouhm.hession.service.HelloWorldService;
import org.junit.Test;

public class TestDispatcherServlet {


    @Test
    public void testServletHession(){
        try {
            String url = "http://localhost:8000/remote/getHelloWorldService";
            HessianProxyFactory factory = new HessianProxyFactory();
            factory.setOverloadEnabled(true);
            HelloWorldService helloWorldService = (HelloWorldService) factory.create(HelloWorldService.class, url);
            System.out.println(helloWorldService.testPrintFirstApi());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
