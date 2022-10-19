package org.example.core.aopProxies.model;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Motor {

    private String fuerza;
    private LocalTime time;

    public void start(){
        System.out.println("Motor started :" +  time);
    }
}
