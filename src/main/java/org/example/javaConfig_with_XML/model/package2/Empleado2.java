package org.example.javaConfig_with_XML.model.package2;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Empleado2 {

    private String nombre;

    public String saludar() {
        return "Soy el empleado" + nombre;
    }
}
