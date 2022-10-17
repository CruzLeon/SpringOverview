package org.example.qualifiers.model;

import lombok.Data;
import org.example.qualifiers.Anotable;
import org.example.qualifiers.Persona;

@Data
@Anotable
public class Empleado implements Persona {

    private String nombre;

    @Override
    public String saludar() {
        return "Soy el empleado" + nombre;
    }
}
