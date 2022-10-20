package org.example.SpEL.beanDefinition;

import org.example.SpEL.beanDefinition.model.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    //Las expresiones son de la forma
    //#{ <expression string> }
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpEl/SpEL_beanDefinitions.xml");
        Client client = context.getBean("client", Client.class);
        System.out.println(client);
        client = context.getBean("client3", Client.class);
        System.out.println(client);

    }
}
