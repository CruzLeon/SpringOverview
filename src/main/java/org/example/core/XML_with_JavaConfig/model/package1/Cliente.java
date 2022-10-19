package org.example.core.XML_with_JavaConfig.model.package1;

import lombok.Data;

@Data
public class Cliente {

    private String nombre;

    public String saludar() {
        return "me llamo" + nombre;
    }
}
