package org.example.core.qualifiers.model;

import lombok.Data;
import org.example.core.qualifiers.Anotable;
import org.example.core.qualifiers.Persona;

@Data
@Anotable
public class Empleado implements Persona {

    private String nombre;

    @Override
    public String saludar() {
        return "Soy el empleado" + nombre;
    }
}
