package org.example.collections;

import org.example.collections.model.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCollections {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collections.xml");
        Client myclient = context.getBean("client", Client.class);
        System.out.println(myclient);
    }
}
