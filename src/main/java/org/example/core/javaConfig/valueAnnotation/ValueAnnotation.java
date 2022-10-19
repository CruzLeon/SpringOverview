package org.example.core.javaConfig.valueAnnotation;

import org.example.core.javaConfig.valueAnnotation.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueAnnotation {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new ClassPathXmlApplicationContext("core/javaConfig/valueAnnotation.xml");
        Car a = context.getBean(Car.class);
        System.out.println(a);
    }

}
