package org.example.qualifiers.model;

import lombok.Data;
import org.example.qualifiers.AnotableConValor;
import org.example.qualifiers.Persona;

@Data
@AnotableConValor(value = "myValor")
public class Gerente implements Persona {

    private String nombre;

    @Override
    public String saludar() {
        return "Soy el gerente" + nombre;
    }
}
