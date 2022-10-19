package org.example.core.eventos.basadosEnAnotaciones.listener;

import org.example.core.eventos.basadosEnAnotaciones.event.AcceptedClient;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AcceptedClientNotifier {


    @EventListener
    public void processAcceptedClientEvent(AcceptedClient acceptedClient) {
        System.out.println("AcceptedCleint");
        System.out.println(acceptedClient);
    }
}
