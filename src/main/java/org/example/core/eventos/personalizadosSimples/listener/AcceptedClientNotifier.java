package org.example.core.eventos.personalizadosSimples.listener;

import org.example.core.eventos.personalizadosSimples.event.AcceptedClient;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AcceptedClientNotifier implements ApplicationListener<AcceptedClient> {

    @Override
    public void onApplicationEvent(AcceptedClient acceptedClient) {
        System.out.println("AcceptedCleint");
        System.out.println(acceptedClient);
    }
}
