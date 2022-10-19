package org.example.core.javaConfig.configuration;

import org.example.core.javaConfig.configuration.model.AppConfig;
import org.example.core.javaConfig.configuration.model.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Config {

    public static void main(String[] args) throws InterruptedException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        Car a = context.getBean(Car.class);
        System.out.println(a);
        a = context.getBean("mycar2",Car.class);
        System.out.println(a);
    }

}
