package org.example.core.postProcessor.model;

import lombok.Data;

@Data
public class Car {

    private String name;

    public void init(){
        System.out.println("Init cat method");
    }

}
