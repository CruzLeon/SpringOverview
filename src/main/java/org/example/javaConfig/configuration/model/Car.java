package org.example.javaConfig.configuration.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
@Primary
public class Car {

    private String name;
    private String another;

    public Car() {
        this.name = "1";
        this.another = "2";
        System.out.println(LocalDateTime.now());
    }
}
