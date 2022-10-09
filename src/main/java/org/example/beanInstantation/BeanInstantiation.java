package org.example.beanInstantation;

import org.example.beanInstantation.model.Client;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class BeanInstantiation {

    public static void main(String[] args) {

        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("beanInstantiation.xml");
        context.refresh();

        Client beanClient = context.getBean("clientBean", Client.class);
        System.out.println(beanClient.getName());

        beanClient = context.getBean("clientFactoryStaticMethod", Client.class);
        System.out.println(beanClient.getName());

        beanClient = context.getBean("clientWithFactoryMethod", Client.class);
        System.out.println(beanClient.getName());

        System.out.println(context.getType("clientWithFactoryMethod"));
    }
}
