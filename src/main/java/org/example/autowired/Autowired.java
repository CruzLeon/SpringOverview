package org.example.autowired;

import org.example.autowired.model.Car;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class Autowired {

    public static void main(String[] args) {

        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("autowired.xml");
        context.refresh();

        Car a = context.getBean("car", Car.class);
        System.out.println(a);

    }
}
