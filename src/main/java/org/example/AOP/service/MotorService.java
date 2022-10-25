package org.example.AOP.service;

import org.example.AOP.interfac.Motor;
import org.springframework.stereotype.Service;

@Service
public class MotorService implements Motor {

    public void transfer() {
        System.out.println("(MOTOR) In public void transfer operation");
    }

    public String returnValue(){
        return new String("return Value");
    }

    @Override
    public Integer integerMethod(String value) {
        return Integer.parseInt(value);
    }

    public String throwing(){
        System.out.println("In throwing method");
        throw new IllegalStateException("Mi value");
    }
}
