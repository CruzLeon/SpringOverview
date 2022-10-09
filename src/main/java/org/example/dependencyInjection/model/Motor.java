package org.example.dependencyInjection.model;

import lombok.Data;

@Data
public class Motor {

    private String fuerza;

    public static Motor createInstance(String fuerza){
        Motor a = new Motor();
        a.setFuerza(fuerza);
        return a;
    }

    public Motor createBeanInstance(String fuerza){
        Motor a = new Motor();
        a.setFuerza(fuerza);
        return a;
    }
}
