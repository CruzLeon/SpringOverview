package org.example.perfiles.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Cliente  {

    private String nombre;
    public String saludar() {
        return "me llamo" + nombre;
    }
}
