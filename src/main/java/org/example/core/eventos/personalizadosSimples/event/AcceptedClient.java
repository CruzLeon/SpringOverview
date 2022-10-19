package org.example.core.eventos.personalizadosSimples.event;

import lombok.ToString;
import org.example.core.eventos.personalizadosSimples.model.Cliente;
import org.springframework.context.ApplicationEvent;

/**
 * Evento personalizado
 */
@ToString
public class AcceptedClient extends ApplicationEvent {

    private final Cliente cliente;

    public AcceptedClient(Object source, Cliente cliente) {
        super(source);
        this.cliente = cliente;
    }

}
