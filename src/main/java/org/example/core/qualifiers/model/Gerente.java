package org.example.core.qualifiers.model;

import lombok.Data;
import org.example.core.qualifiers.AnotableConValor;
import org.example.core.qualifiers.Persona;

@Data
@AnotableConValor(value = "myValor")
public class Gerente implements Persona {

    private String nombre;

    @Override
    public String saludar() {
        return "Soy el gerente" + nombre;
    }
}
