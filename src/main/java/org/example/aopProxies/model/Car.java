package org.example.aopProxies.model;

import lombok.Data;

@Data
public class Car {

    private Motor motor;

    public void doit() {
        motor.start();
    }

}
