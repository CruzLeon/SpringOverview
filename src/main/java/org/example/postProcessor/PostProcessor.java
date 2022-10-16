package org.example.postProcessor;

import org.example.postProcessor.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostProcessor {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new ClassPathXmlApplicationContext("postProcessor.xml");
        Car a = context.getBean("car", Car.class);
        System.out.println(a.getName());
    }

}
