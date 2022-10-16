package org.example.javaConfig;

import org.example.javaConfig.valueAnnotation.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueAnnotation {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new ClassPathXmlApplicationContext("javaConfig/valueAnnotation.xml");
        Car a = context.getBean(Car.class);
        System.out.println(a);
    }

}
