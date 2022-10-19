package org.example.eventos.personalizadosSimples.event;

import lombok.ToString;
import org.example.eventos.personalizadosSimples.model.Cliente;
import org.springframework.context.ApplicationEvent;

/**
 * Evento personalizado
 */
@ToString
public class RefusedClient extends ApplicationEvent {

    private final Cliente cliente;

    public RefusedClient(Object source, Cliente cliente) {
        super(source);
        this.cliente = cliente;
    }

}
