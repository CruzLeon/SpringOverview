package org.example.perfiles.model;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Data
@Profile("dev")
@Component
public class Empleado {

    private String nombre;
    public String saludar() {
        return "me llamo" + nombre;
    }
}
