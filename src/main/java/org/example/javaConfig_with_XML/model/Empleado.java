package org.example.javaConfig_with_XML.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Empleado {

    private String nombre;

    public String saludar() {
        return "Soy el empleado" + nombre;
    }
}
