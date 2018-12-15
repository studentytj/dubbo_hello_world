package com.test.helloprovider;

import com.test.hello.api.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author ytj
 * @date 2018/12/15
 */
public class HelloProviderApplication {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        IUserService userService = context.getBean("userService", IUserService.class);
        String sayHi = userService.sayHi("God");
        System.err.println(sayHi);
        System.in.read();
    }
}
