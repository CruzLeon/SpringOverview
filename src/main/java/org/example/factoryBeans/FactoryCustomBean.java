package org.example.factoryBeans;

import org.example.factoryBeans.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryCustomBean {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new ClassPathXmlApplicationContext("factoryBean.xml");
        Car a = context.getBean("factoryCar", Car.class);
        Car b = context.getBean("factoryCar", Car.class);

        System.out.println(a);
        System.out.println(b);

    }

}
