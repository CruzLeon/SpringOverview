package org.example.core.eventos.basadosEnAnotaciones.event;

import lombok.ToString;
import org.example.core.eventos.basadosEnAnotaciones.model.Cliente;
import org.springframework.context.ApplicationEvent;

/**
 * Evento personalizado
 */
@ToString
public class RefusedClient extends ApplicationEvent {

    public Cliente getCliente() {
        return cliente;
    }

    private final Cliente cliente;

    public RefusedClient(Object source, Cliente cliente) {
        super(source);
        this.cliente = cliente;
    }

}
