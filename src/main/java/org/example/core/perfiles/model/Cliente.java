package org.example.core.perfiles.model;

import lombok.Data;

@Data
public class Cliente  {

    private String nombre;
    public String saludar() {
        return "me llamo" + nombre;
    }
}
