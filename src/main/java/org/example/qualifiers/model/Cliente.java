package org.example.qualifiers.model;

import lombok.Data;
import org.example.qualifiers.Persona;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
@Qualifier("cliente")
public class Cliente implements Persona {

    private String nombre;

    @Override
    public String saludar() {
        return "me llamo" + nombre;
    }
}
