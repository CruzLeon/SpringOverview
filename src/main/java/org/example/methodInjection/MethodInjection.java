package org.example.methodInjection;

import org.example.methodInjection.model.Car;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class MethodInjection {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new ClassPathXmlApplicationContext("methodInjection.xml");
        Car a = context.getBean("car", Car.class);
        a.doit();
        Thread.sleep(1000);
        a.doit();
        Thread.sleep(2000);
        System.out.println("Method Injection");
        Car b = context.getBean("car2", Car.class);
        b.doit2();
        Thread.sleep(1000);
        b.doit2();
    }
}
