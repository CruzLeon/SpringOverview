package org.example.javaConfig.configuration;

import org.example.javaConfig.configuration.model.AppConfig;
import org.example.javaConfig.configuration.model.Car;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

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
