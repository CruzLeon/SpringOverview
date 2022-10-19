package org.example.core.eventos.basadosEnAnotaciones.listener;

import org.example.core.eventos.basadosEnAnotaciones.event.AcceptedClient;
import org.example.core.eventos.basadosEnAnotaciones.event.RefusedClient;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RefusedClientNotifier  {


    @EventListener
    public AcceptedClient processRefusedClientEvent(RefusedClient refusedClient) {
        System.out.println("Notificacion");
        System.out.println(refusedClient);
        return new AcceptedClient(this,refusedClient.getCliente());
    }
}
