package org.example.core.beanInstantation.model;

import lombok.Data;

@Data
public class Client {
    private String name;
    private int old;

    public static Client createInstance(){
        Client a = new Client();
        a.setName("leoFactory");
        return a;
    }
}
