package org.example.aopProxies;

import org.example.aopProxies.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aopProxies {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new ClassPathXmlApplicationContext("aopProxies.xml");
        Car a = context.getBean("car", Car.class);
        a.doit();
        Thread.sleep(1000);
        a.doit();
        Thread.sleep(2000);

    }
}
