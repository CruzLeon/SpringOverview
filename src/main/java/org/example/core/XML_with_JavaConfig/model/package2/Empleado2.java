package org.example.core.XML_with_JavaConfig.model.package2;

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
