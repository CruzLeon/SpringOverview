package org.example.core.dependencyInjection;

import org.example.core.dependencyInjection.model.Car;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class DependencyInjection {

    public static void main(String[] args) {

        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("core/dependencyInjection.xml");
        context.refresh();

        Car a = context.getBean("car", Car.class);
        System.out.println(a);

        a = context.getBean("carType", Car.class);
        System.out.println(a);

        //Setter injection requires default class constructor
        a = context.getBean("carSetter", Car.class);
        System.out.println(a);

    }
}
