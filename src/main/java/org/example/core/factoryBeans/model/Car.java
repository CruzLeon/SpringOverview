package org.example.core.factoryBeans.model;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Car {

    private String name;

    {
        System.out.println("Init cat method" + LocalTime.now());
    }

}
