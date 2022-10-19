package org.example.core.methodInjection.model;

import lombok.Data;

@Data
public class Car {

    private Motor motor;

    public void doit() {
        motor.start();
    }

    public void doit2() {
        createMotor().start();
    }

    public Motor createMotor(){
        //Delegate container method injection
        return null;
    }
}
