package org.example.beanInstantation.model;

public class ClientFactoryBean {

    public Client createInstance(){
        Client a = new Client();
        a.setName("LeoFactoryMethod");
        return a;
    }
}
