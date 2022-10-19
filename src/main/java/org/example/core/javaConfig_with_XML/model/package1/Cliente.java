package org.example.core.javaConfig_with_XML.model.package1;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cliente {

    private String nombre;

    public String saludar() {
        return "me llamo" + nombre;
    }
}
