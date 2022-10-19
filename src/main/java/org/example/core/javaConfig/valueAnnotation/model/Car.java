package org.example.core.javaConfig.valueAnnotation.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Car {

    @Value("${name}")
    private String name;
    @Value("${another}")
    private String another;


}
