package org.example.core.dependencyInjection.model;

import lombok.Data;

@Data
public class Car {

    private String name;
    private int kilo;
    private Motor motor;

    public Car(Motor motor) {
        this.motor = motor;
    }

    public Car(String name, int kilo, Motor motor) {
        this.name = name;
        this.kilo = kilo;
        this.motor = motor;
    }
    //Setter injection requires default class constructor
    public Car(){}
}
