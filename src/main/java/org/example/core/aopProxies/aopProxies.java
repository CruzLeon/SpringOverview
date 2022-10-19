package org.example.core.aopProxies;

import org.example.core.aopProxies.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aopProxies {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new ClassPathXmlApplicationContext("core/aopProxies.xml");
        Car a = context.getBean("car", Car.class);
        a.doit();
        Thread.sleep(1000);
        a.doit();
        Thread.sleep(2000);

    }
}
