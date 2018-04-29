package com.zouhm.hession;

import com.zouhm.hession.service.HelloWorldService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDispatcherServletByLocalBean {

    @Test
    public void testHelloWorldApi(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        String result = helloWorldService.testPrintFirstApi();
        System.out.println(result);
    }
}
